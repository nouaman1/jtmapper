package org.jterramapper.io;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import org.jtmapper.terraria.Chest;
import org.jtmapper.terraria.Constants;
import org.jtmapper.terraria.Item;
import org.jtmapper.terraria.NPC;
import org.jtmapper.terraria.Sign;
import org.jtmapper.terraria.TerrariaHeader;
import org.jtmapper.terraria.TileType;
import org.jtmapper.terraria.TileTypeDefinitions;

public class Reader {
	private File f;
	private LEBinaryReader r;

	public long tileOffset = 0;
	public long chestOffset = 0;
	public long signOffset = 0;
	public long npcOffset = 0;

	public Reader(File file) throws IOException {
		f = file;
		r = new LEBinaryReader(f);
	}

	public void seekToTiles() {
		try {
			r.seek(tileOffset);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void seekToChests() {
		try {
			r.seek(chestOffset);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void seekToSigns() {
		try {
			r.seek(signOffset);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void seekToNpcs() {
		try {
			r.seek(npcOffset);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public long getPos() throws IOException {
		return r.getPos();
	}

	public TerrariaHeader readHeader() {
		TerrariaHeader h = new TerrariaHeader();
		try {
			r.seek(0);
			h.releaseNumber = r.readInt();
			h.worldName = r.readString();
			h.id = r.readInt();

			int x1 = r.readInt();
			int x2 = r.readInt();
			int y1 = r.readInt();
			int y2 = r.readInt();
			h.worldCoords = new Rectangle(x1, y1, x2 - x1, y2 - y1);
			h.maxTiles = new Dimension(r.readInt(), r.readInt());
			h.spawnPoint = new Point(r.readInt(), r.readInt());
			h.surfaceLevel = r.readDouble();
			h.rockLayer = r.readDouble();
			h.tempTime = r.readDouble();
			h.isDay = r.readBoolean();
			h.moonPhase = r.readInt();
			h.isBloodMoon = r.readBoolean();
			h.dungeonPoint = new Point(r.readInt(), r.readInt());
			h.isBoss1Dead = r.readBoolean();
			h.isBoss2Dead = r.readBoolean();
			h.isBoss3Dead = r.readBoolean();
			h.isShadowOrbSmashed = r.readBoolean();
			h.isMeteorSpawned = r.readBoolean();
			h.shadowOrbsSmashed = (byte) r.readByte();
			h.invasionDelay = r.readInt();
			h.invasionSize = r.readInt();
			h.invasionType = r.readInt();
			h.invasionPointX = r.readDouble();

			tileOffset = r.getPos();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return h;
	}

	public TileType getNextTile() throws IOException {
		boolean isTilePresent = r.readBoolean();
		TileType tileType = TileType.Unknown;
		int blockType = 0x00;
		if (isTilePresent) {
			blockType = r.readByte();
			if (TileTypeDefinitions.tiles[blockType].isImportant) {
				r.readShort();
				r.readShort();
			}
			tileType = TileTypeDefinitions.tiles[blockType].tileType;
		} else {
			tileType = TileType.Sky;
		}
		boolean isLit = r.readBoolean();
		boolean isWall = r.readBoolean();
		if (isWall) {
			int wallType = r.readByte();
			if (tileType == TileType.Unknown || tileType == TileType.Sky) {
				if (TileTypeDefinitions.tiles[(int) wallType
						+ Constants.wallOffset] == null) {
					tileType = TileType.Unknown;
				} else {
					tileType = TileTypeDefinitions.tiles[(int) wallType
							+ Constants.wallOffset].tileType;
				}

			}
		}
		boolean isLiquid = r.readBoolean();
		if (isLiquid) {
			int liquidLevel = r.readByte();
			boolean isLava = r.readBoolean();
			if (isWall || tileType == TileType.Sky) {
				tileType = isLava ? TileType.Lava : TileType.Water;
			}

		}
		return tileType;
	}

	public Chest getNextChest(int chestID) throws IOException {
		if (r.readBoolean()) {
			Chest c = new Chest(chestID, new Point(r.readInt(), r.readInt()));
			for (int i = 0; i < Constants.chestMaxItems; i++) {
				int count = r.readByte();
				if (count > 0) {
					c.addItem(new Item(r.readString(), count));
				}
			}
			long pos = r.getPos();
			return c;
		}
		return null;
	}

	public Sign getNextSign(int signID) throws IOException {
		boolean isValid = r.readBoolean();
		if (!isValid) {
			return null;
		}
		String s = r.readString();
		return new Sign(signID, s, new Point(r.readInt(), r.readInt()));
	}

	public NPC getNextNPC(int npcID) throws IOException {
		boolean isValid = r.readBoolean();
		if (!isValid) {
			return null;
		}
		return new NPC(npcID, r.readString(), new Point((int) r.readFloat(),
				(int) r.readFloat()), r.readBoolean(), new Point(r.readInt(),
				r.readInt()));
	}

	public void close() {
		try {
			r.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

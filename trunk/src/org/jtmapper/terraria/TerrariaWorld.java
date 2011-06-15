package org.jtmapper.terraria;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.jterramapper.io.Reader;

public class TerrariaWorld {
	public TerrariaHeader header;
	public Reader r;
	public List<Chest> chests;
	public List<Sign> signs;
	public List<NPC> npcs;

	public TerrariaWorld(File file) throws IOException {
		r = new Reader(file);
		header = r.readHeader();
	}

	public void createPreview(File output, boolean drawWalls,
			boolean drawSymbols, boolean drawNpcs) throws IOException {
		// Reset Symbol List
		// this.tilesToSymbolize = new Dictionary<TileType, List<Point>>();
		chests = new ArrayList<Chest>();
		signs = new ArrayList<Sign>();
		npcs = new ArrayList<NPC>();

		int maxY = (int) header.maxTiles.width; // NOTE the things are swapped
		int maxX = (int) header.maxTiles.height;

		BufferedImage bitmap = new BufferedImage(maxX, maxY,
				BufferedImage.TYPE_INT_RGB);
		Graphics g = bitmap.createGraphics();
		g.setColor(Constants.Colors.SKY);
		g.fillRect(0, 0, maxX, maxY);

		// TileProperties properties;
		TileType tileType;
		int prog = 0;
		for (int col = 0; col < maxX; col++) {
			int prog2 = (int) (((float) col / (float) maxX) * 100.0f);
			if (prog != prog2) {
				prog = prog2;
				System.out.println(prog);
			}
			for (int row = 0; row < maxY; row++) {
				tileType = r.getNextTile();
				if (tileType == TileType.Sky && row > (int) header.surfaceLevel) {
					tileType = TileType.WallBackground;
				}

				// skip walls
				if (!drawWalls && tileType.getID() > Constants.wallOffset) {
					continue;
				}
				// skip chests for now
				if (tileType == TileType.Chest) {
					continue;
				}

				// otherwise draw
				g.setColor(TileTypeDefinitions.tiles[tileType.getID()].color);
				g.fillRect(col, row, 1, 1);
			}
		}

		r.chestOffset = r.getPos();
		for (int i = 0; i < Constants.chestMaxNumber; i++) {
			Chest chest = r.getNextChest(i);
			if (chest == null) {
				continue;
			}
			chests.add(chest);
		}

		r.signOffset = r.getPos();
		for (int i = 0; i < Constants.signMaxNumber; i++) {
			Sign sign = r.getNextSign(i);
			if (sign == null) {
				continue;
			}
			signs.add(sign);
		}

		r.npcOffset = r.getPos();
		for (int i = 0;; i++) {
			NPC npc = r.getNextNPC(i);
			if (npc == null) {
				break;
			}
			npcs.add(npc);
			BufferedImage img = npc.getHeadIMG();
			if (img != null) {
				g.drawImage(img, (npc.pos.x / 16) - (img.getWidth() / 2),
						(npc.pos.y / 16) - (img.getHeight() / 2), null);
			}
		}

		System.out.println("100");
		System.out.println("Render complete! Saving data...");
		ImageIO.write(bitmap, "png", output);
		System.out.println("Done!");
	}
}

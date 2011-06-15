import java.awt.Color;

public class TileProperties {
	public boolean isImportant; // has multiple images, randomized
	public TileType tileType;
	public Color color;
	public boolean hasSymbol;

	public TileProperties(TileType tileType, boolean isTileImportant,
			Color color, boolean hasSymbol) {
		this.tileType = tileType;
		this.isImportant = isTileImportant;
		this.color = color;
		this.hasSymbol = hasSymbol;
	}

	public TileProperties(TileType tileType, boolean isTileImportant,
			Color color) {
		this(tileType, isTileImportant, color, false);
	}
}

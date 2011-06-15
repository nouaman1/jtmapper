import java.awt.Color;

public class Constants {
	public static final int wallOffset = 258;
	public static final int chestMaxItems = 20;
	public static final int chestMaxNumber = 1000;
	public static final int signMaxNumber = 1000;

	public static class Colors {
		public static Color DIRT = new Color(175, 131, 101);
		public static Color STONE = new Color(128, 128, 128);
		public static Color GRASS = new Color(28, 216, 94);
		public static Color PLANTS = new Color(13, 101, 36);
		public static Color LIGHT_SOURCE = new Color(253, 62, 3);
		public static Color IRON = new Color(189, 159, 139);
		public static Color COPPER = new Color(255, 149, 50);
		public static Color GOLD = new Color(185, 164, 23);
		public static Color WOOD = new Color(86, 62, 44);
		public static Color WOOD_BLOCK = new Color(168, 121, 87);
		public static Color SILVER = new Color(217, 223, 223);
		public static Color DECORATIVE = new Color(0, 255, 242);
		public static Color IMPORTANT = new Color(255, 0, 0);
		public static Color CORRUPTION_STONE = new Color(98, 95, 167);
		public static Color CORRUPTION_GRASS = new Color(141, 137, 223);
		public static Color CORRUPTION_STONE2 = new Color(75, 74, 130);
		public static Color CORRUPTION_VINES = new Color(122, 97, 143);
		public static Color BLOCK = new Color(178, 0, 255);
		public static Color METEORITE = Color.MAGENTA;// new Color(223, 159,
														// 137);
		public static Color CLAY = new Color(216, 115, 101);
		public static Color DUNGEON_GREEN = new Color(26, 136, 34);
		public static Color DUNGEON_PINK = new Color(169, 49, 117);
		public static Color DUNGEON_BLUE = new Color(66, 69, 194);
		public static Color SPIKES = new Color(109, 109, 109);
		public static Color WEB = new Color(255, 255, 255);
		public static Color SAND = new Color(255, 218, 56);
		public static Color OBSIDIAN = new Color(87, 81, 173);
		public static Color ASH = new Color(68, 68, 76);
		public static Color HELLSTONE = new Color(102, 34, 34);
		public static Color MUD = new Color(92, 68, 73);
		public static Color UNDERGROUNDJUNGLE_GRASS = new Color(143, 215, 29);
		public static Color UNDERGROUNDJUNGLE_PLANTS = new Color(143, 215, 29);
		public static Color UNDERGROUNDJUNGLE_VINES = new Color(138, 206, 28);
		public static Color UNDERGROUNDJUNGLE_THORNS = new Color(94, 48, 55);
		public static Color GEMS = new Color(42, 130, 250);

		public static Color UNDERGROUNDMUSHROOM_GRASS = new Color(93, 127, 255);
		public static Color UNDERGROUNDMUSHROOM_PLANTS = new Color(177, 174,
				131);
		public static Color UNDERGROUNDMUSHROOM_TREES = new Color(150, 143, 110);

		public static Color LAVA = new Color(255, 72, 0);
		public static Color WATER = new Color(0, 12, 255);
		public static Color SKY = new Color(155, 209, 255);
		public static Color WALL_STONE = new Color(66, 66, 66);
		public static Color WALL_DIRT = new Color(88, 61, 46);
		public static Color WALL_STONE2 = new Color(61, 58, 78);
		public static Color WALL_WOOD = new Color(73, 51, 36);
		public static Color WALL_BRICK = new Color(60, 60, 60);
		public static Color WALL_BACKGROUND = new Color(50, 50, 60);
		public static Color WALL_DUNGEON_PINK = new Color(84, 25, 60);
		public static Color WALL_DUNGEON_BLUE = new Color(29, 31, 72);
		public static Color WALL_DUNGEON_GREEN = new Color(14, 68, 16);
		public static Color UNKNOWN = Color.MAGENTA;
	}

	public enum CellType {
		AIR, TILE, WALL, WATER, LAVA, UNKNOWN;
	}
}

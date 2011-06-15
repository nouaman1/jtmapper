import java.awt.Color;

public class TileTypeDefinitions {
	public static TileProperties[] tiles = new TileProperties[300];

	public static void init() {
		tiles[0] = new TileProperties(TileType.Dirt, false,
				Constants.Colors.DIRT);
		tiles[1] = new TileProperties(TileType.Stone, false,
				Constants.Colors.STONE);
		tiles[2] = new TileProperties(TileType.Grass, false,
				Constants.Colors.GRASS);
		tiles[3] = new TileProperties(TileType.Plants, true,
				Constants.Colors.PLANTS);
		tiles[4] = new TileProperties(TileType.Torches, false,
				Constants.Colors.LIGHT_SOURCE);
		tiles[5] = new TileProperties(TileType.Trees, true,
				Constants.Colors.WOOD);
		tiles[6] = new TileProperties(TileType.Iron, false,
				Constants.Colors.IRON);
		tiles[7] = new TileProperties(TileType.Copper, false,
				Constants.Colors.COPPER);
		tiles[8] = new TileProperties(TileType.Gold, false,
				Constants.Colors.GOLD);
		tiles[9] = new TileProperties(TileType.Silver, false,
				Constants.Colors.SILVER);

		tiles[10] = new TileProperties(TileType.Door1, true,
				Constants.Colors.DECORATIVE);
		tiles[11] = new TileProperties(TileType.Door2, true,
				Constants.Colors.DECORATIVE);
		tiles[12] = new TileProperties(TileType.Heart, true,
				Constants.Colors.IMPORTANT, true);
		tiles[13] = new TileProperties(TileType.Bottles, true,
				Constants.Colors.DECORATIVE);
		tiles[14] = new TileProperties(TileType.Table, true,
				Constants.Colors.DECORATIVE);
		tiles[15] = new TileProperties(TileType.Chair, true,
				Constants.Colors.DECORATIVE);
		tiles[16] = new TileProperties(TileType.Anvil, true,
				Constants.Colors.DECORATIVE);
		tiles[17] = new TileProperties(TileType.Furnace, true,
				Constants.Colors.DECORATIVE);
		tiles[18] = new TileProperties(TileType.CraftingTable, true,
				Constants.Colors.DECORATIVE);
		tiles[19] = new TileProperties(TileType.WoodenPlatform, false,
				Constants.Colors.WOOD);
		tiles[20] = new TileProperties(TileType.PlantsDecorative, true,
				Constants.Colors.PLANTS);

		tiles[21] = new TileProperties(TileType.Chest, true,
				Constants.Colors.IMPORTANT, true);
		tiles[22] = new TileProperties(TileType.CorruptionStone1, false,
				Constants.Colors.CORRUPTION_STONE);
		tiles[23] = new TileProperties(TileType.CorruptionGrass, false,
				Constants.Colors.CORRUPTION_GRASS);
		tiles[24] = new TileProperties(TileType.CorruptionPlants, true,
				Constants.Colors.CORRUPTION_GRASS);
		tiles[25] = new TileProperties(TileType.CorruptionStone2, false,
				Constants.Colors.CORRUPTION_STONE2);
		tiles[26] = new TileProperties(TileType.Altar, true,
				Constants.Colors.IMPORTANT, true);
		tiles[27] = new TileProperties(TileType.Sunflower, true,
				Constants.Colors.PLANTS);
		tiles[28] = new TileProperties(TileType.Pot, true,
				Constants.Colors.IMPORTANT);
		tiles[29] = new TileProperties(TileType.PiggyBank, true,
				Constants.Colors.DECORATIVE);
		tiles[30] = new TileProperties(TileType.BlockWood, false,
				Constants.Colors.WOOD_BLOCK);

		tiles[31] = new TileProperties(TileType.ShadowOrb, true,
				Constants.Colors.IMPORTANT, true);
		tiles[32] = new TileProperties(TileType.CorruptionVines, false,
				Constants.Colors.CORRUPTION_VINES);
		tiles[33] = new TileProperties(TileType.Candle, true,
				Constants.Colors.LIGHT_SOURCE);
		tiles[34] = new TileProperties(TileType.ChandlerCopper, true,
				Constants.Colors.LIGHT_SOURCE);
		tiles[35] = new TileProperties(TileType.ChandlerSilver, true,
				Constants.Colors.LIGHT_SOURCE);
		tiles[36] = new TileProperties(TileType.ChandlerGold, true,
				Constants.Colors.LIGHT_SOURCE);
		tiles[37] = new TileProperties(TileType.Meterorite, false,
				Constants.Colors.METEORITE);
		tiles[38] = new TileProperties(TileType.BlockStone, false,
				Constants.Colors.BLOCK);
		tiles[39] = new TileProperties(TileType.BlockRedStone, false,
				Constants.Colors.BLOCK);
		tiles[40] = new TileProperties(TileType.Clay, false,
				Constants.Colors.CLAY);

		tiles[41] = new TileProperties(TileType.BlockBlueStone, false,
				Constants.Colors.DUNGEON_BLUE);
		tiles[42] = new TileProperties(TileType.LightGlobe, true,
				Constants.Colors.LIGHT_SOURCE);
		tiles[43] = new TileProperties(TileType.BlockGreenStone, false,
				Constants.Colors.DUNGEON_GREEN);
		tiles[44] = new TileProperties(TileType.BlockPinkStone, false,
				Constants.Colors.DUNGEON_PINK);
		tiles[45] = new TileProperties(TileType.BlockGold, false,
				Constants.Colors.BLOCK);
		tiles[46] = new TileProperties(TileType.BlockSilver, false,
				Constants.Colors.BLOCK);
		tiles[47] = new TileProperties(TileType.BlockCopper, false,
				Constants.Colors.BLOCK);
		tiles[48] = new TileProperties(TileType.Spikes, false,
				Constants.Colors.SPIKES);
		tiles[49] = new TileProperties(TileType.CandleBlue, false,
				Constants.Colors.LIGHT_SOURCE);
		tiles[50] = new TileProperties(TileType.Books, true,
				Constants.Colors.DECORATIVE);

		tiles[51] = new TileProperties(TileType.Web, false,
				Constants.Colors.WEB);
		tiles[52] = new TileProperties(TileType.Vines, false,
				Constants.Colors.PLANTS);
		tiles[53] = new TileProperties(TileType.Sand, false,
				Constants.Colors.SAND);
		tiles[54] = new TileProperties(TileType.Glass, false,
				Constants.Colors.DECORATIVE);
		tiles[55] = new TileProperties(TileType.Signs, true,
				Constants.Colors.DECORATIVE);
		tiles[56] = new TileProperties(TileType.Obsidian, false,
				Constants.Colors.OBSIDIAN);
		tiles[57] = new TileProperties(TileType.Ash, false,
				Constants.Colors.ASH);
		tiles[58] = new TileProperties(TileType.Hellstone, false,
				Constants.Colors.HELLSTONE);
		tiles[59] = new TileProperties(TileType.Mud, false,
				Constants.Colors.MUD);
		tiles[60] = new TileProperties(TileType.UndergroundJungleGrass, false,
				Constants.Colors.UNDERGROUNDJUNGLE_GRASS);

		tiles[61] = new TileProperties(TileType.UndergroundJunglePlants, true,
				Constants.Colors.UNDERGROUNDJUNGLE_PLANTS);
		tiles[62] = new TileProperties(TileType.UndergroundJungleVines, false,
				Constants.Colors.UNDERGROUNDJUNGLE_VINES);
		tiles[63] = new TileProperties(TileType.Sapphire, false,
				Constants.Colors.GEMS, true);
		tiles[64] = new TileProperties(TileType.Ruby, false,
				Constants.Colors.GEMS, true);
		tiles[65] = new TileProperties(TileType.Emerald, false,
				Constants.Colors.GEMS, true);
		tiles[66] = new TileProperties(TileType.Topaz, false,
				Constants.Colors.GEMS, true);
		tiles[67] = new TileProperties(TileType.Amethyst, false,
				Constants.Colors.GEMS, true);
		tiles[68] = new TileProperties(TileType.Diamond, false,
				Constants.Colors.GEMS, true);
		tiles[69] = new TileProperties(TileType.UndergroundJungleThorns, false,
				Constants.Colors.UNDERGROUNDJUNGLE_THORNS);
		tiles[70] = new TileProperties(TileType.UndergroundMushroomGrass,
				false, Constants.Colors.UNDERGROUNDMUSHROOM_GRASS);

		tiles[71] = new TileProperties(TileType.UndergroundMushroomPlants,
				true, Constants.Colors.UNDERGROUNDMUSHROOM_PLANTS);
		tiles[72] = new TileProperties(TileType.UndergroundMushroomTrees, true,
				Constants.Colors.UNDERGROUNDMUSHROOM_TREES);
		tiles[73] = new TileProperties(TileType.Plants2, true,
				Constants.Colors.PLANTS);
		tiles[74] = new TileProperties(TileType.Plants3, true,
				Constants.Colors.PLANTS);
		tiles[75] = new TileProperties(TileType.BlockObsidian, false,
				Constants.Colors.BLOCK);
		tiles[76] = new TileProperties(TileType.BlockHellstone, false,
				Constants.Colors.BLOCK);
		tiles[77] = new TileProperties(TileType.UnderworldFurnance, true,
				Constants.Colors.IMPORTANT);
		tiles[78] = new TileProperties(TileType.DecorativePot, true,
				Constants.Colors.DECORATIVE);
		tiles[79] = new TileProperties(TileType.Bed, true,
				Constants.Colors.DECORATIVE);
		tiles[80] = new TileProperties(TileType.Unknown, false,
				Constants.Colors.UNKNOWN);

		for (int i = 80; i < 255; i++) {
			tiles[i] = new TileProperties(TileType.Unknown, false,
					Color.MAGENTA);
		}

		tiles[256] = new TileProperties(TileType.Sky, false,
				Constants.Colors.SKY);
		tiles[257] = new TileProperties(TileType.Water, false,
				Constants.Colors.WATER);
		tiles[258] = new TileProperties(TileType.Lava, false,
				Constants.Colors.LAVA);

		// Walls
		tiles[259] = new TileProperties(TileType.WallStone, false,
				Constants.Colors.WALL_STONE);
		tiles[260] = new TileProperties(TileType.WallDirt, false,
				Constants.Colors.WALL_DIRT);
		tiles[261] = new TileProperties(TileType.WallStone2, false,
				Constants.Colors.WALL_STONE2);
		tiles[262] = new TileProperties(TileType.WallWood, false,
				Constants.Colors.WALL_WOOD);
		tiles[263] = new TileProperties(TileType.WallBrick, false,
				Constants.Colors.WALL_BRICK);
		tiles[264] = new TileProperties(TileType.WallRed, false,
				Constants.Colors.WALL_BRICK);
		tiles[265] = new TileProperties(TileType.WallBlue, false,
				Constants.Colors.WALL_DUNGEON_BLUE);
		tiles[266] = new TileProperties(TileType.WallGreen, false,
				Constants.Colors.WALL_DUNGEON_GREEN);
		tiles[267] = new TileProperties(TileType.WallPink, false,
				Constants.Colors.WALL_DUNGEON_PINK);
		tiles[268] = new TileProperties(TileType.WallGold, false,
				Constants.Colors.WALL_BRICK);
		tiles[269] = new TileProperties(TileType.WallSilver, false,
				Constants.Colors.WALL_BRICK);
		tiles[270] = new TileProperties(TileType.WallCopper, false,
				Constants.Colors.WALL_BRICK);
		tiles[271] = new TileProperties(TileType.WallHellstone, false,
				Constants.Colors.WALL_BRICK);
		tiles[272] = new TileProperties(TileType.WallHellstone, false,
				Constants.Colors.WALL_BACKGROUND);
	}
}

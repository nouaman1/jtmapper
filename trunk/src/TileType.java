public enum TileType {
	Dirt(0), Stone(1), Grass(2), Plants(3), Torches(4), Trees(5), Iron(6), Copper(7), Gold(8), Silver(9), Door1(10), Door2(11), Heart(12), Bottles(13), Table(14), Chair(15), Anvil(16), Furnace(17), CraftingTable(18), WoodenPlatform(19), PlantsDecorative(20), Chest(21), CorruptionStone1(22), CorruptionGrass(23), CorruptionPlants(24), CorruptionStone2(25), Altar(26), Sunflower(27), Pot(28), PiggyBank(29), BlockWood(30), ShadowOrb(31), CorruptionVines(32), Candle(33), ChandlerCopper(34), ChandlerSilver(35), ChandlerGold(36), Meterorite(37), BlockStone(38), BlockRedStone(39), Clay(40), BlockBlueStone(41), LightGlobe(42), BlockGreenStone(43), BlockPinkStone(44), BlockGold(45), BlockSilver(46), BlockCopper(47), Spikes(48), CandleBlue(49), Books(50), Web(51), Vines(52), Sand(53), Glass(54), Signs(55), Obsidian(56), Ash(57), Hellstone(58), Mud(59), UndergroundJungleGrass(60), UndergroundJunglePlants(61), UndergroundJungleVines(62), Sapphire(63), Ruby(64), Emerald(65), Topaz(66), Amethyst(67), Diamond(68), UndergroundJungleThorns(69), UndergroundMushroomGrass(70), UndergroundMushroomPlants(71), UndergroundMushroomTrees(72), Plants2(73), Plants3(74), BlockObsidian(75), BlockHellstone(76), UnderworldFurnance(77), DecorativePot(78), Bed(79), Unknown(80), Spawn(255), Sky(256), Water(257), Lava(258), WallStone(259), WallDirt(260), WallStone2(261), WallWood(262), WallBrick(263), WallRed(264), WallBlue(265), WallGreen(266), WallPink(267), WallGold(268), WallSilver(269), WallCopper(270), WallHellstone(271), WallBackground(272);
	private int id;

	private TileType(int id) {
		this.id = id;
	}

	public int getID() {
		return id;
	}
}

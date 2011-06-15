import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		String in = null;
		String out = null;
		boolean drawNpcs = false;
		boolean drawSymbols = false;
		boolean drawWalls = false;

		if (args.length < 4) {
			help();
		}
		
		for (int i = 0; i < args.length; i++) {
			if (args[i].equalsIgnoreCase("-i")) {
				if (i == args.length - 1) {
					help();
				}
				in = args[++i];
			}
			if (args[i].equalsIgnoreCase("-o")) {
				if (i == args.length - 1) {
					help();
				}
				out = args[++i];
			}
			if (args[i].equalsIgnoreCase("--drawnpcs")) {
				drawNpcs = true;
			}
			if (args[i].equalsIgnoreCase("--drawsymbols")) {
				drawSymbols = true;
			}
			if (args[i].equalsIgnoreCase("--drawwalls")) {
				drawWalls = true;
			}
		}
		if (in == null || out == null)
			help();

		TileTypeDefinitions.init();
		TerrariaWorld tw = new TerrariaWorld(new File(in));
		tw.createPreview(new File(out), drawWalls, drawSymbols, drawNpcs);
		tw.r.close();
	}

	private static void help() {
		final String help = "USAGE:\njterramapper -i \"INPUT.wld\" -o \"OUTPUT.png\" [--drawnpcs --drawsymbols --drawwalls]";
		System.out.print(help);
		System.exit(0);
	}
}

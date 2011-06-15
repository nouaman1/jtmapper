import java.awt.Point;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class NPC {
	public int id;
	public String name;
	public Point pos;
	public boolean homeless;
	public Point homePos;

	public NPC(int id, String name, Point pos, boolean homeless, Point homePos) {
		this.id = id;
		this.name = name;
		this.pos = pos;
		this.homeless = homeless;
		this.homePos = homePos;
	}

	public BufferedImage getHeadIMG() {
		try {
			return ImageIO.read(getClass().getResource(
					"/images/" + name + ".png"));
		} catch (Exception e) {
			return null;
		}
	}
}

package org.jtmapper.terraria;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;


public class Chest {
	public int id;
	public Point pos;
	public List<Item> items;
	
	public Chest(int id, Point pos) {
		this.id = id;
		this.pos = pos;
		this.items = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
}

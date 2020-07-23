package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;

public class MouseMorph extends Polymorph{

	MouseMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.MAGENTA);
		g.fillRect(getX(), getY(), 50, 50);
		
	}

	public void update() {
		PointerInfo a = MouseInfo.getPointerInfo();
		Point b = a.getLocation();
		setX((int) b.getX());
		setY((int) b.getY());
	}
}

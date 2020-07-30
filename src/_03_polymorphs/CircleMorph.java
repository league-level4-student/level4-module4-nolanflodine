package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph{
int speedX = 1;
	CircleMorph(int x, int y) {
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
		setX((int) (getX()+Math.cos(speedX)*100));
		setY((int) (getY()+Math.sin(speedX)*100));
		speedX++;
	}
}

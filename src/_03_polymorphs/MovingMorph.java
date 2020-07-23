package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {
	int speed = 5;
	MovingMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.black);
		g.fillRect(getX(), getY(), 50, 50);
	}
	
	public void update() {
		if(getX()>900||getX()<0) {
			speed = speed*-1;
		}
		
		setX(getX()+speed);
	}

}

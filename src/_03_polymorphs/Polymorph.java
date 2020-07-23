package _03_polymorphs;

import java.awt.Graphics;

import javax.swing.JPanel;

public abstract class Polymorph extends JPanel {
    private int x;
    private int y;
    public int width = 50;
    public int height = 50;
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }   
    public void update(){
    }
    public int getX(){
    	return x;
    }
    public void setX(int x) {
    	this.x = x;
    }
    public int getY() {
    	return y;
    }
    public void setY(int y) {
    	this.y = y;
    }
    public int getWidth() {
    	return width;
    }
    public void setWidth(int w) {
    	width = w;
    }
    public int getHeight() {
    	return height;
    }
    public void setHeight(int h) {
    	height = h;
    }
    public abstract void draw(Graphics g);
}

package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    ArrayList<Polymorph> poly = new ArrayList<Polymorph>();
    int movingY = HEIGHT/2;
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 MessageMorph m = new MessageMorph(WIDTH/2, HEIGHT/2);
   	 window.addMouseListener(m);
   	 window.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 poly.add(new BluePolymorph(50, 50));
   	 poly.add(new RedMorph(200,50));
   	 poly.add(new MovingMorph(0, movingY));
   	 poly.add(new CircleMorph(WIDTH/3, -100));
   	 poly.add(new MouseMorph(50,50));
   	 poly.add(new MessageMorph(WIDTH/2, HEIGHT/2));
   	 poly.add(new ImageMorph(200,150));
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, WIDTH, HEIGHT);
   	
   	 //draw polymorph
   	 for (int i = 0; i < poly.size(); i++) {
		poly.get(i).draw(g);
	}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 for (int i = 0; i < poly.size(); i++) {
 		poly.get(i).update();
 	}
    }
}

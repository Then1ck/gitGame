package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Panel extends JPanel implements Runnable {

	private int ScreenWidth=1280, ScreenHeight=720;
	private JFrame Window;
	private boolean Fullscreen = false;
	
	public Panel() {
		this.setPreferredSize(new Dimension(ScreenWidth, ScreenHeight));
		this.setBackground(Color.black);
		
		this.setDoubleBuffered(true);
		this.setFocusable(true);
		
		Window = Main.getWindow(this, Fullscreen);
	}
	
	public void newWindow() {
		Window.dispose();
		Window = Main.getWindow(this, Fullscreen);
	}
	
	@Override
	public void run() {
		
	}

}

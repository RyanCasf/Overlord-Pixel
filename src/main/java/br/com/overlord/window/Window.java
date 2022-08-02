package br.com.overlord.window;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Window extends JFrame {

	public Window(String title) {
		this.setTitle(title);
		this.setBounds(0,0,720,360);
		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		icon();
		this.add(WindowConfig.generateSPA());
		
		this.setUndecorated(false);
		this.setVisible(true);
	}
	
	private void icon() {
		try {
			Image icon = ImageIO.read(getClass().getResourceAsStream("/image/ainz.png"));
		    setIconImage(icon);
		}
		catch (IOException e) {
			System.err.println("Icon not found!");
		}
	}
}
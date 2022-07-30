package br.com.overlord.window;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Window extends JFrame {

	private static Dimension dimension;
	
	public Window(String title) {
		this.setTitle(title);
		this.setBounds(0,0,720,360);
		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		icon();
		this.add(WindowConfig.generateSPA());
		
		 dimension = Toolkit.getDefaultToolkit().getScreenSize();

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
	
	public static Dimension getDimension() {
		return dimension;
	}
}
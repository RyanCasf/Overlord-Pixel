package br.com.overlord.window;

import javax.swing.JFrame;

public class Window extends JFrame {

	public Window(String title) {
		this.setTitle(title);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setBounds(0,0,1920,1080);
		
		this.add(WindowConfig.generateSPA());
		
		this.setUndecorated(false);
		this.setVisible(true);
	}
}
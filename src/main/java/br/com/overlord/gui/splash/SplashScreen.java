package br.com.overlord.gui.splash;

import java.awt.Color;

import javax.swing.JProgressBar;

import br.com.overlord.gui.config.Panel;
import br.com.overlord.window.Window;

public class SplashScreen extends Panel {
	
	public static final String NAME_PAGE = "Splash";
	private static JProgressBar progressBar = new JProgressBar();

	public SplashScreen() {
		super();
		this.add(progressBar);
	}
	
	public static void start() {
		System.out.println(Window.getDimension().width + " | " + Window.getDimension().height);
		
		progressBar.setBounds(0,(Window.getDimension().height - 92),(Window.getDimension().width - 1),20);
		progressBar.setValue(0);
		progressBar.setBackground(Color.WHITE);
		progressBar.setForeground(Color.GREEN);
		
		try {
			for (byte i=0; i<=100; i++) {
				Thread.sleep(100);
				progressBar.setValue(i);
			}
		}
		catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
	}
}
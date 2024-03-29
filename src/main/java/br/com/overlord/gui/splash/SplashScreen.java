package br.com.overlord.gui.splash;

import java.awt.Color;

import javax.swing.JProgressBar;

import br.com.overlord.gui.component.Panel;
import br.com.overlord.gui.main.MainPanel;
import br.com.overlord.window.WindowConfig;
import br.com.overlord.window.WindowUtil;

public class SplashScreen extends Panel {
	private static final long serialVersionUID = 6460081552355499340L;
	
	public static final String NAME_PAGE = "Splash";
	private static JProgressBar progressBar = new JProgressBar();

	public SplashScreen() {
		super();
		this.add(progressBar);
	}
	
	public static void start() {
		progressBar.setBounds(0,(WindowUtil.getDimension().height - 92),(WindowUtil.getDimension().width - 1),20);
		progressBar.setValue(0);
		progressBar.setBackground(Color.decode("#202028"));
		progressBar.setForeground(Color.decode("#8a68ea"));
		progressBar.setBorderPainted(false);
		
		try {
			for (byte i=0; i<=100; i++) {
				Thread.sleep(10);
				progressBar.setValue(i);
			}
		}
		catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
		
		WindowConfig.alterScreen(MainPanel.NAME_PAGE);
	}
}
package br.com.overlord.window;

import java.awt.CardLayout;

import javax.swing.JPanel;

import br.com.overlord.gui.LoginPanel;
import br.com.overlord.gui.MainPanel;

public class WindowConfig {

	private static CardLayout screensController = new CardLayout();
	private static JPanel screens = new JPanel(screensController);
	
	private WindowConfig() {
		throw new IllegalStateException("Utility class");
	}

	public static JPanel generateSPA() {
		screens.add(new LoginPanel(), LoginPanel.NAME_PAGE);
		screens.add(new MainPanel(), MainPanel.NAME_PAGE);
		
		return screens;
	}
	
	public static void alterScreen(String namePage) {
		screensController.show(screens, namePage);
	}
}
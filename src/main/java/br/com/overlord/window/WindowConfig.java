package br.com.overlord.window;

import java.awt.CardLayout;

import javax.swing.JPanel;

import br.com.overlord.gui.login.LoginPanel;
import br.com.overlord.gui.main.MainPanel;
import br.com.overlord.gui.splash.SplashScreen;

public class WindowConfig {

	private static CardLayout screensController = new CardLayout();
	private static JPanel screens = new JPanel(screensController);

	private WindowConfig() {
		throw new IllegalStateException("Utility class");
	}

	public static JPanel generateSPA() {
		screens.add(new SplashScreen(), SplashScreen.NAME_PAGE);
		screens.add(new LoginPanel(), LoginPanel.NAME_PAGE);
		screens.add(new MainPanel(), MainPanel.NAME_PAGE);

		return screens;
	}

	public static void alterScreen(String namePage) {
		screensController.show(screens, namePage);
	}
}
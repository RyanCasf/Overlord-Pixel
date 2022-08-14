package br.com.overlord.init;

import br.com.overlord.gui.splash.SplashScreen;
import br.com.overlord.window.Window;

public class App {
	
	public static void main(String[] args) {
		new Window("Overlord");
		SplashScreen.start();
	}
}
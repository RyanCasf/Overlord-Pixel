package br.com.overlord.init;

import java.io.IOException;

import br.com.overlord.window.Window;

public class App {
	
	public static void main(String[] args) {
		try {
			Window window = new Window("Overlord");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
package br.com.overlord.init.dao;

public class ReadDAO {

	private ReadDAO() {
		throw new IllegalStateException("Utility class");
	}
	
	public static String json() {
		Json json = new Json();
		return json.get();
	}
}
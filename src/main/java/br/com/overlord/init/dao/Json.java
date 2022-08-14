package br.com.overlord.init.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class Json {
	
	public String get() {
		StringBuilder sb = new StringBuilder("");
		
		URL urlJSON = ReadDAO.class.getClassLoader().getResource("dataset/set.json");
		File fileDAO = new File(urlJSON.getPath());
		
		try (BufferedReader reader = new BufferedReader(new FileReader(fileDAO))) {
			while (reader.ready()) {
				sb.append(reader.readLine());
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return sb.toString();
	}
}
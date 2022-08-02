package br.com.overlord.init.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;

public class ReadDAO {

	public static String read() {
		StringBuilder sb = new StringBuilder("");
		
		try {
			URL urlJSON = ReadDAO.class.getClassLoader().getResource("dataset/set.json");
			File fileDAO = new File(urlJSON.getPath());
			BufferedReader reader = new BufferedReader(new FileReader(fileDAO));
			
			while (reader.ready()) {
				sb.append(reader.readLine());
			}
			
			reader.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return sb.toString();
	}
}
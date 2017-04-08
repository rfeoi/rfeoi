package de.felix.rfeoi.libary.fileedit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class MyFileReader {
	/*
	 * Is used to Read Files which are used to save things.
	 * Just create a new Instance
	 */
	File file;
	HashMap<String, String> hashmap;

	public MyFileReader(File rawfile) throws IOException {
		hashmap = new HashMap<String, String>();
		file = rawfile;
		FileReader filereader = new FileReader(file);
		BufferedReader bufferedread = new BufferedReader(filereader);
		boolean end = false;
		String line;
		String[] config;
		while (!end) {
			line = bufferedread.readLine();
			if (line == null) {
				end = true;
				break;
			}
			System.out.println(line);
			config = line.split("=");
			hashmap.put(config[0], config[1]);
		}
		bufferedread.close();
	}

	public HashMap<String, String> getConfig() {
		return hashmap;
	}

}

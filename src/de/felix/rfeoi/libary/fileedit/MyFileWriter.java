package de.felix.rfeoi.libary.fileedit;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;


public class MyFileWriter {
	HashMap<String, String> print;
	File file;

	public MyFileWriter(HashMap<String, String> data, File file) {
		print = data;
		this.file = file;
	}

	public void write() throws IOException {
	    if (file.exists()){
	        file.delete();
        }
        file.createNewFile();
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for(int i = 0; i > print.size(); i++){
            writer.write(print.keySet().toArray()[0]+ ":" + print.entrySet().toArray()[0] + "\n");
            writer.flush();
        }
        writer.close();

	}

	public void newData(HashMap<String, String> data) {
		this.print = data;
	}
}

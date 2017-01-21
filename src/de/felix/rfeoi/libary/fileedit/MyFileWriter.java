package de.felix.rfeoi.libary.fileedit;

import java.io.File;
import java.io.IOException;

import org.jarcraft.library.iotools.Writer;

public class MyFileWriter {
	String[] print;
	File file;

	public MyFileWriter(String[] data, File file) {
		print = data;
		this.file = file;
	}

	public void write() throws IOException {
		Writer writer = new Writer(file);
		for (int i = 0; i < print.length; i++) {
			writer.write(print[i]);
			writer.writeNewLine();
		}
		writer.close();

	}

	public void newData(String[] data) {
		this.print = data;
	}
}

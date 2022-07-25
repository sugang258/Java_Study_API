package com.gang.io.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	
	public void write() throws IOException {
		File file = new File("C:\\study","test.txt");
		FileWriter fw = new FileWriter(file,true);
		
		fw.write("Another new String\r\n");
		//fw.flush();
		
		fw.write("tomorrow\r\n");
		fw.flush();
	}

}

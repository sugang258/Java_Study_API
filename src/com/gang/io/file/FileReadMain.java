package com.gang.io.file;

import java.io.IOException;

public class FileReadMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileRead fr = new FileRead();
		FileWrite fw = new FileWrite();
		
		fw.write();
		fr.read();

	}

}

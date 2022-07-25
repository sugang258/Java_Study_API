package com.gang.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	
	public void read() throws IOException {
		//파일의 내용 읽어오기
		//1. 어느 폴더의 어느 파일
		File file = new File("C:\\study","test.txt");
		
		//2. 파일과 연결
		FileReader fr = new FileReader(file);
		//fr.read() : 한글자
		//3. 파일의 내용 읽기위한 보조 스트림 연결
		BufferedReader br = new BufferedReader(fr);
		
		
		//4. 내용 읽기
		boolean check = true;
		while(check) {
			String name = br.readLine(); //엔터키를 만날 때까지 읽어옴
			if(name == null) {
				break;
			}
			System.out.println(name);

		}
		
	}

}

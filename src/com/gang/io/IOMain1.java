package com.gang.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
	
			System.out.println("키보드에서 입력 후 엔터");
			String msg;
			try {
			msg = br.readLine();
			System.out.println(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

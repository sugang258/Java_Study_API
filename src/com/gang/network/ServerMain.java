package com.gang.network;

import java.io.IOException;

public class ServerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Server Start");
		
		Server2 s1 = new Server2();
		
		try {
			s1.getFood();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Server Finish");

	}

}

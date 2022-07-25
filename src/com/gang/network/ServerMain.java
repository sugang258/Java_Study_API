package com.gang.network;

import java.io.IOException;

public class ServerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Server Start");
		
		Server1 s1 = new Server1();
		
		try {
			s1.receive();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Server Finish");

	}

}

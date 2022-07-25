package com.gang.network;

public class ClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Client Start");
		Client2 c1 = new Client2();
		
		try {
			c1.getFood();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Client Finish");

	}

}

package com.gang.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class Server2 {
	
	//getFood
	//Server에서 메세지를 기다림
	//1. 점심 메뉴 중 랜덤하게 하나를 client로 전송
	//2. 저녁 메뉴 중 랜덤하게 하나를 client로 전송
	//3. 프로그램 종료
	//그외 나머지 : 잘못 입력된 번호입니다 전송
	
	private ArrayList<String> lunch;
	private ArrayList<String> dinner;
	
	public Server2() {
		lunch = new ArrayList<>();
		dinner = new ArrayList<>();
		
		lunch.add("짜장면");
		lunch.add("라면");
		lunch.add("햄버거");
		lunch.add("피자");
		lunch.add("굶어");
		
		dinner.add("삼겹살");
		dinner.add("치킨");
		dinner.add("소고기");
		dinner.add("초밥");
		dinner.add("곱창");
	}
	
	
	public void getFood() throws IOException {
		
		ServerSocket serverSocket = new ServerSocket(8282);
		
		System.out.println("Client 접속 기다리는 중");
		
		Socket socket = serverSocket.accept();
		System.out.println("Client 접속 완료");
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		boolean check = true;
		
		while(check) {
			
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			String message = br.readLine();
			
			
			System.out.println("Client : " + message);
			
			
			Random random = new Random(Calendar.getInstance().getTimeInMillis());
			int ran = random.nextInt(5);
			
			if(message.equals("1")) {
				
				String menu = lunch.get(ran);

				System.out.println("Server : " + menu);
				
			}else if(message.equals("2")) {
				
				String menu = dinner.get(ran);

				System.out.println("Server : " + menu);

			}else if(message.equals("3")) {				
				System.out.println("종료");
				break;
				
			}else {
				System.out.println("1-3번 중에 입력하세요");
			}
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			bw.write(message + "\r\n");
			bw.flush();
			
			
		}
		br.close();
		ir.close();
		is.close();
		
		
		bw.close();
		ow.close();
		os.close();
		
		socket.close();
		serverSocket.close();
		
		
	}
	

}

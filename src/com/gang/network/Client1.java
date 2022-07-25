package com.gang.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {

	public void send() throws Exception {
		boolean check = true;
		while(check) {
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("192.168.7.50",8282);
		System.out.println("Server 접속 완료");
		System.out.println("Server로 보낼 message");
		
		String message = sc.next();
		
		
		OutputStream os =  socket.getOutputStream(); //0,1
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		//전송
		bw.write(message +"\r\n");
		bw.flush();
		
		//---------------------------------
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		message = br.readLine();
		System.out.println("Server : " + message);
		
		if(message == "q") {
			check =! check;
		//자원해제
		bw.close();
		ow.close();
		os.close();
		socket.close();
		break;
		}
		}
		
		
		
	}
}

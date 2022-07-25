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
import java.util.Scanner;

public class Server1 {

	public void receive() throws IOException {
		boolean check = true;
		while(check) {
		Scanner sc = new Scanner(System.in);
		ServerSocket serverSocket = new ServerSocket(8282);
		//서버 오픈하고 Client의 접속을 기다림
		System.out.println("Client 접속 기다리는 중");
		//Socket : 상대방과 1:1통신
		
		Socket socket = serverSocket.accept();
		System.out.println("Client 접속 완료");
		
		InputStream is = socket.getInputStream(); //0,1
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		String message = br.readLine();
		System.out.println("Client :" + message);
		
		
		//--------------------------------
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		System.out.println("클라이언트로 보낼 메세지 입력");
		message = sc.next();
		
		bw.write(message + "\r\n");
		bw.flush();
		
		if(message == "q") {
			check =! check;
		br.close();
		ir.close();
		is.close();
		socket.close();
		serverSocket.close();
		break;
		}
		}
	}
}

package com.gang.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {
	private WeatherService ws;
	private WeatherView wv;
	//결합도가 강하다(높다) : 자체에서 객체 생성
	//결합도가 느슨하다(낮다) : 매개변수를 통해서 만들어진 객체를 주입
	//					  :생성자의 매개변수, 	
	
	public WeatherController() {
		this.ws = new WeatherService();
		this.wv = new WeatherView();
	}
	
	//WeatherController
			//start
			//1. 날씨정보 초기화 - init 호출
			//2. 전국날씨 출력
			//3. 지역날씨 검색
			//4. 지역정보 추가
			//5. 지역정보 삭제
			//6. 종료
	public void start() {
		ArrayList<CityDTO> ar = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		//WeatherService ws = new WeatherService();
		//WeatherView wv = new WeatherView();
		
		boolean check = true;
		while(check) {
		
		System.out.println("1. 날씨정보 초기화");
		System.out.println("2. 전국날씨 출력");
		System.out.println("3. 지역날씨 검색");
		System.out.println("4. 지역정보 추가");
		System.out.println("5. 지역정보 삭제");
		System.out.println("6. 종료");
		
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			ws.init(ar);
			break;
			
		case 2:
			wv.view(ar);
			break;
		
		case 3:
			CityDTO cityDTO = ws.find(ar);
			if(cityDTO != null) {
				wv.view(cityDTO);
			}else {
				wv.view("잘못된 도시명이다아");
			}
			break;
			
		case 4:
			boolean result = ws.add(ar);
			String message = "추가 실패";
			if(result) {
				message = "추가 성공";
			}
			wv.view(message);
			break;
			
		case 5:
			boolean result1 = ws.remove(ar);
			String message1 = "추가 실패";
			if(result1) {
				message1 = "추가 성공";
			}
			wv.view(message1);
			break;
			
		case 6:
			System.out.println("종료");
			check =! check;
			break;
		}
		}
		
	}}



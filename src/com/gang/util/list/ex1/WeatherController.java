package com.gang.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {
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
		WeatherService ws = new WeatherService();
		WeatherView wv = new WeatherView();
		
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
			ws.find(ar);
			break;
			
		case 4:
			ws.add(ar);
			break;
			
		case 5:
			ws.remove(ar);
			break;
			
		case 6:
			System.out.println("종료");
			check =! check;
		}
		}
		
	}}



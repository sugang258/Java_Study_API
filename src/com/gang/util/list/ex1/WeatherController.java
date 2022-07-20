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
		
		System.out.println("1. 날씨정보 초기화");
		System.out.println("2. 전국날씨 출력");
		System.out.println("3. 지역날씨 검색");
		System.out.println("4. 지역정보 추가");
		System.out.println("5. 지역정보 삭제");
		System.out.println("6. 종료");
		
		int num = sc.nextInt();
		while(check) {
		if(num == 1) {
			ws.init(ar);
			
		}else if(num == 2) {
			wv.view(ar);
		
		}else if(num == 3) {
			ws.find(ar);
			
		}else if(num == 4) {
			ws.add(ar);
			
		}else if(num == 5) {
			ws.remove(ar);
			
		}else {
			System.out.println("종료");
			check =! check;
		}
		}
		
	}

}

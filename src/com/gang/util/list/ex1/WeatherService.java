package com.gang.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {
	
	Scanner sc = new Scanner(System.in);
	WeatherView wv = new WeatherView();
	private StringBuffer sb;
	
	public WeatherService() {
		// TODO Auto-generated constructor stub
		sb = new StringBuffer();
		sb.append("Seoul,30.2,70,맑음");
		sb.append("Daegu-38.9-90-흐림");
		sb.append("Jeju,12.1,10,눈");
		sb.append("Busan-0.5,85,태풍");
		
		//init 메서드
		//sb에 있는 Data들을 파싱해서 CityDTO에 담아서 리턴
		//ArrayList 에 담아서 리턴
		
		//add
		//city 정보를 입력받아서 추가
		
		//remove
		//도시명을 입력받아서 리스트에서 삭제
		
		//find
		//도시명을 입력받아서 리스트에서 검색 후 리턴
	}
	public void init(ArrayList<CityDTO> ar) {
		String info = sb.toString();
		info = info.replace(",", "-");
		
		StringTokenizer st = new StringTokenizer(info,"-");
		
		while(st.hasMoreTokens()) {
			CityDTO cityDTO = new CityDTO();
			cityDTO.setName(st.nextToken());
			cityDTO.setGion(Double.parseDouble(st.nextToken()));
			cityDTO.setHum(Integer.parseInt(st.nextToken()));
			cityDTO.setStatus(st.nextToken());
			ar.add(cityDTO);
		}
		/*
		CityDTO cityDTO = new CityDTO();
		
		
		String [] infos = newInfo.split("-");
		
		for(int i=0;i<infos.length;i++) {
			//CityDTO cityDTO = new CityDTO();

			
			cityDTO.setName(infos[i].trim());
			cityDTO.setGion(infos[i].trim());
			cityDTO.setHum(infos[i].trim());
			cityDTO.setStatus(infos[i].trim());
			ar.add(cityDTO);
		}
		wv.view(ar);
		*/
		
		//return wv.view(ar);
		
		
		
	}
	
	public boolean add(ArrayList<CityDTO> ar) {
		
		CityDTO cityDTO = new CityDTO();
		
		System.out.println("지역 이름을 입력하세요");
		cityDTO.setName(sc.next());
		System.out.println("기온을 입력하세요");
		cityDTO.setGion(sc.nextDouble());
		System.out.println("습도를 입력하세요");
		cityDTO.setHum(sc.nextInt());
		System.out.println("상태를 입력하세요");
		cityDTO.setStatus(sc.next());
		
		return ar.add(cityDTO);
	}
	
	public boolean remove(ArrayList<CityDTO> ar) {
		
		String name;
		System.out.println("삭제할 도시 이름을 입력하세요");
		name = sc.next();
		boolean r = false;
				
		for(int i=0;i<ar.size();i++) {
			if(name.equals(ar.get(i).getName()) ) {
				ar.remove(i);
				r = !r;
				break;
			}
		}
		return r;
		/*
		 * for(CityDTO cityDTO : ar) {
		 * 		if(name.equals(cityDTO.getName())) {
		 * 			ar.remove(cityDTO);
		 * 			break;
		 * 		}
		 * }
		 */
	}
	
	public CityDTO find(ArrayList<CityDTO> ar) {
		CityDTO cityDTO = null;
		String name;
		System.out.println("검색할 도시명을 입력하세요");
		name = sc.next();
		/*
		for(int i=0;i<ar.size();i++) {
			if(name.equals(ar.get(i).getName())) {
				System.out.println(ar.get(i));
			}
		}
		*/
		for(CityDTO cy : ar) {
			if(name.equals(cy.getName())) {
				cityDTO = cy;
				break;
			}
		}
		return cityDTO;
		
	}

}

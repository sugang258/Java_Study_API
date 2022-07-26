package com.gang.io.file.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.gang.util.list.ex1.CityDTO;

public class StudentDAO {
	//DTO : Data Transfer Object
	//DAO : Data Access Object
	//	file data에 접근
	
	//2. setList
	public int setList(ArrayList<StudentDTO> ar) {
		//예외처리는 내부에서 처리
		//List로 받은 데이터들을 studentdata에다가 작성
		//기존의 내용은 삭제
		//작성 형식은 기존 내용의 형식과 동일하게
		//1을 리턴 : 정상적인 성공
		//0을 리턴 : 예외가 발생했을경우
		int result = 1;
		File file = new File("C:\\study", "studentdata.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write("\r\n");
			for(StudentDTO studentDTO : ar) {
				StringBuffer stringBuffer = new StringBuffer();
				stringBuffer.append(studentDTO.getName() + ",");
				stringBuffer.append(studentDTO.getNum() + ",");
				stringBuffer.append(studentDTO.getKor() + ",");
				stringBuffer.append(studentDTO.getKor() + ",");
				stringBuffer.append(studentDTO.getEng() + ",");
				stringBuffer.append(studentDTO.getMath() + "\r\n");
				
				fw.write(stringBuffer.toString());

			}				

			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = 0;
		}
		
		
		return result;
		
	}
	
	//1. getList
	//	  studentdata 파일의 내용을 읽어서 작업
	
	public ArrayList<StudentDTO> getList() throws Exception {
		File file = new File("C:\\study\\studentdata.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		StudentDTO studentDTO = new StudentDTO();
		ArrayList<StudentDTO> arraylist = new ArrayList<StudentDTO>();
		
		boolean check = true;
		br.readLine();
		while(check) {
			String text = br.readLine();
			
			if(text == null) {
				break;
			}
			
			String [] strArray = text.split(",");
			studentDTO.setName(strArray[0]);
			studentDTO.setNum(Integer.parseInt(strArray[1]));
			studentDTO.setKor(Integer.parseInt(strArray[2]));
			studentDTO.setEng(Integer.parseInt(strArray[3]));
			studentDTO.setMath(Integer.parseInt(strArray[4]));
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng() + studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3);
			arraylist.add(studentDTO);
			
			/*
			System.out.println("이름 : " + studentDTO.getName());
			System.out.println("번호 : " + studentDTO.getNum());
			System.out.println("국어점수 : " + studentDTO.getKor());
			System.out.println("영어점수 : " + studentDTO.getEng());
			System.out.println("수학점수 : " + studentDTO.getMath());
			System.out.println("총점 : " + studentDTO.getTotal());
			System.out.println("평균 : " + studentDTO.getAvg());
			System.out.println("================");
			*/
		}
		return arraylist;
	}

}

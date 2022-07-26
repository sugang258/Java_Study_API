package com.gang.io.file.ex1;

import java.util.ArrayList;

import com.gang.util.list.ex1.CityDTO;

public class StudentView {
	//view
	//ArrayList<StudentDTO> 출력
	
	//view
	//StudentDTO 출력
	
	//view
	//메세지(String) 하나를 받아서 출력
	public void view(ArrayList<StudentDTO> ar) {
		for(int i=0;i<ar.size();i++) {
			StudentDTO studentDTO = ar.get(i);
			this.view(studentDTO);
		}
	}
	
	public void view(StudentDTO studentDTO) {
		System.out.println(studentDTO.getName());
		System.out.println(studentDTO.getNum());
		System.out.println(studentDTO.getKor());
		System.out.println(studentDTO.getEng());
		System.out.println(studentDTO.getMath());
		System.out.println(studentDTO.getTotal());
		System.out.println(studentDTO.getAvg());
	}
	
	public void view(String msg) {
		System.out.println(msg);
	}

}

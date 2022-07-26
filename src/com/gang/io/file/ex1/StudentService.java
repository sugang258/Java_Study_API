package com.gang.io.file.ex1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements Service {
	private StudentDAO stdao;
	Scanner sc;
	
	public StudentService() {
		this.stdao = new StudentDAO();
		this.sc = new Scanner(System.in);
	}

	@Override
	public ArrayList<StudentDTO> getList() throws Exception {
		
		ArrayList<StudentDTO> ar = stdao.getList();
		for(StudentDTO studentDTO:ar) {
			studentDTO.setTotal(studentDTO.getKor() + studentDTO.getEng() + studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal() / 3);
		}
		
		
		return ar;
		
	}
	
	@Override
	public int setList(ArrayList<StudentDTO> ar) {
		
		
		return stdao.setList(ar);
		
	}
	
	@Override
	public StudentDTO getStudent(ArrayList<StudentDTO> ar) {
		StudentDTO studentDTO = null;
		System.out.println("검색할 학생의 번호를 입력하세요");
		int st = sc.nextInt();
		
		for(StudentDTO studentDTO2 : ar) {
			if(st == studentDTO2.getNum()) {
				studentDTO = studentDTO2;
				break;
			}
		}
		
		return studentDTO;
		
	}
	
	@Override
	public int setStudentDelete(ArrayList<StudentDTO> ar) {
		int result = 0;
		System.out.println("삭제할 학생 번호 입력");
		int num = sc.nextInt();
		for(int i=0;i<ar.size();i++) {
			if(num == ar.get(i).getNum()) {
				StudentDTO st = ar.remove(i);
				if(st != null) {
					result = 1;
				}
			}
		}
		return result;
		
	}
	
	@Override
	public void setStudentAdd(ArrayList<StudentDTO> ar) {
		StudentDTO studentDTO = new StudentDTO();
		System.out.println("추가할 학생 이름 입력");
		studentDTO.setName(sc.next());
		System.out.println("번호 입력");
		studentDTO.setNum(sc.nextInt());
		System.out.println("국어 입력");
		studentDTO.setKor(sc.nextInt());
		System.out.println("영어 입력");
		studentDTO.setEng(sc.nextInt());
		System.out.println("수학 입력");
		studentDTO.setMath(sc.nextInt());
		studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
		studentDTO.setAvg(studentDTO.getTotal()/3);
		
		
	}

}

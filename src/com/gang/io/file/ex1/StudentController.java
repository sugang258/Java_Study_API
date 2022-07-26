package com.gang.io.file.ex1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
	StudentView sv = new StudentView();
	StudentService ss = new StudentService();
	StudentDAO stdao = new StudentDAO();
	
	//start 메서드
	//1. 학생정보출력 - 모든 학생정보 출력
	//2. 학생정보검색 - getStudent
	//3. 학생정보추가 - setStudentAdd
	//4. 학생정보삭제 - setStudentDelete 
	//5. 백업	   - setList
	//6. 종료
	
	public void start() throws Exception {
		ArrayList<StudentDTO> ar = new ArrayList<StudentDTO>();
		
		boolean check = true;
		while(check) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 학생정보출력");
		System.out.println("2. 학생정보검색");
		System.out.println("3. 학생정보추가");
		System.out.println("4. 학생정보삭제");
		System.out.println("5. 백업");
		System.out.println("6. 종료");
	
		stdao.getList();
		int num = sc.nextInt();
		
				
			switch(num) {
			case 1: 
				sv.view(ss.getList());
				break;
			case 2:
				//getStudent
				ss.getStudent(ar);
				break;
			case 3:
				//getStudentAdd
				ss.setStudentAdd(ar);
				break;
			case 4:
				//setStudentDelete
				ss.setStudentDelete(ar);
				break;
			case 5:
				//setList
				ss.setList(ar);
				break;
			case 6:
				System.out.println("종료");
				check =! check;
				break;
				
			}
		}
	}
	

}

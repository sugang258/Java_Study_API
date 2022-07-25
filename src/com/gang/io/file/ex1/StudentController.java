package com.gang.io.file.ex1;

import java.util.Scanner;

public class StudentController {
	
	//start 메서드
	//1. 학생정보출력 - 모든 학생정보 출력
	//2. 학생정보검색 - getStudent
	//3. 학생정보추가 - setStudentAdd
	//4. 학생정보삭제 - setStudentDelete 
	//5. 백업	   - setList
	//6. 종료
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 학생정보출력");
		System.out.println("2. 학생정보검색");
		System.out.println("3. 학생정보추가");
		System.out.println("4. 학생정보삭제");
		System.out.println("5. 백업");
		System.out.println("6. 종료");
	
		int num = sc.nextInt();
		boolean check = true;
		
		while(check) {
			switch(num) {
			case 1: 
				//StudentView-view
			case 2:
				//getStudent
			case 3:
				//getStudentAdd
			case 4:
				//setStudentDelete
			case 5:
				//setList
			case 6:
				System.out.println("종료");
				check =! check;
				break;
				
			}
		}
	}
	

}

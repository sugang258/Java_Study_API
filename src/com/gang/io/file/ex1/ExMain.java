package com.gang.io.file.ex1;

import java.io.IOException;

public class ExMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StudentDAO stDAO = new StudentDAO();
		StudentService service = new StudentService();
		service.getList();
		stDAO.getList();
		//stDAO.setList();

	}

}

package com.gang.string.ex1;

public class SplitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkerService ws = new WorkerService();
		WorkerView wv = new WorkerView();
		
		WorkerDTO [] workerDTOs = ws.init();
		wv.view(workerDTOs);
		int num = 10;
		
		String str = String.valueOf(num);
		System.out.println(str);
		

	}

}

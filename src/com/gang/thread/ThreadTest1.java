package com.gang.thread;

public class ThreadTest1 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.getNum();
	}
	
	private void getNum()   {
		
		for(int i = 0; i < 25; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}

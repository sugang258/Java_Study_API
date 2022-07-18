package com.gang.lang.ex1;

public class Phone {
	
	private int price;
	private int size;
	
	
	//equals메서드 오버라이딩
	//각 멤버의 값이 같으면 true, 하나라도 틀리면 false 리턴
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	
		Phone c = (Phone) obj;

        return (c.getPrice() == this.getPrice() && c.getSize() == this.getSize());
		}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	

}

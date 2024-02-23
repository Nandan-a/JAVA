package com.cdac.abstraction;

public  class Point extends Shape {
	
	public void draw() {
		System.out.println("Drawing a point....");
	}
	
	public static void main(String[] args) {
		Point p1=new Point();
		p1.setColor("Blue");
		System.out.println(p1.getColor());
		p1.draw();
	}

}

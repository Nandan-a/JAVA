package com.cdac.inh;



public class Car extends Accelartor implements Brakeable,Audiable{
//	public void brake() {
//		
//		
//		System.out.println("Stopping the car!!");
//	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.accelarator();
		c.brake();
		c.playmusic();
		
	}

	public void brake() {
	System.out.println("Stopping the car!!");
	
}

	@Override
	public void playmusic() {
		System.out.println("playing Music.....");
		
	}


}

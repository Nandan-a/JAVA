package day_02;

public abstract class Shape {
	
	private String color;

	public String getColor() {               //concrete method= that contain code within it
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	public abstract void draw();
	

}

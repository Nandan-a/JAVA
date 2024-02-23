
/*package demooo;

public class box {
	int length,width,height;
	public static void main(String[] args) {
		box b1;       //object reference
		b1 = new box();
		
		System.out.println(b1.length+ " "+b1.width);
		
	}

}
*/

/*
package demooo;

public class box {
	int length,width,height;
	
	public void setDim(int length,int width,int height) {
		this.length=length;
		this.width=width;
		this.height=height;
	}
	
	public void displayDim() {
		
		System.out.println("Length : "+this.length+ " width : "+this.width + " Height : "+ this.height);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		box b1;       //object reference
		b1 = new box();
		
		b1.setDim(20, 120, 30);
		b1.displayDim();
		
		box b2;       //object reference
		b2 = new box();
		
		b2.setDim(10, 123, 142);
		b2.displayDim();
		
	}

}
*/

//------------------------constructor-------------------------------------

package demooo;

public class box {
	int length,width,height;
	
	public box() {}       //default no arrgument constructor i.e with no argumnet constructor
	
	
	
	public box(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;                            //right click --> source --> Generate constructor using feilds
	}



	/*public box(int length,int width,int height) {
		this.length=length;
		this.width=width;
		this.height=height;
	}*/
	
	/*public void displayDim() {
		
		System.out.println("Length : "+this.length+ " width : "+this.width + " Height : "+ this.height);
	}*/

	
	public String toString() {
		return "box [length=" + length + ", width=" + width + ", height=" + height + "]";
	}

	public int calcVolume() {
		int volume;
		volume = this.length * this.width * this.height;
		return volume;
		
	}

	public static void main(String[] args) {
		box b1;       //object reference
		b1 = new box(2,3,4);
		System.out.println(b1);              //reprents the hexadecimal memmoory
//		b1.displayDim();
		System.out.println("volume is "+b1.calcVolume());
		
		box b2;       //object reference
		b2 = new box();
		
	
//		b2.displayDim();
		
	}

}


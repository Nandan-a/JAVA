package day_02;

public class calculator {
	public int add(int a,int b) {
		return a + b;		
	}
	
	public String add(String a,String b) {
		return a + b;		
	}
	
	public static void main(String[] args) {
		calculator c = new calculator();
		System.out.println("sum is :" +c.add(12, 140));
		
		System.out.println(c.add("hii", " Nandan"));
	}
}

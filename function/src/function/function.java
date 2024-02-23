package function;

//public class function {
//	
//	public void greet() {
//		System.out.println("Hello World!");
//	}
//	public static void main(String[] args) {
//		function md = new function();
//		
//		md.greet();
//			
//	}
//	
//}

//-------------method 2----------------------
//public class function {
//	
//	public void greet() {
//		System.out.println("Hello World!");
//	}
//	public void greetuser(String uname) {
//		System.out.println("Hello "+uname);
//	}
//	
//	public static void main(String[] args) {
//		function md = new function();
//		
//		//md.greet();
//		md.greetuser("Nandan");
//			
//	}
//	
//}
//-------------method 3 return type----------------------
public class function {
	
	public void greet() {
		System.out.println("Hello World!");
	}
	public void greetuser(String uname) {
		System.out.println("Hello "+uname);
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		function md = new function();
		
		//md.greet();
//		md.greetuser("Nandan");
		int sum = md.add(12,42);
		System.out.println(sum);
			
	}
	
}
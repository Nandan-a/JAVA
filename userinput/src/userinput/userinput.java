package userinput;

import java.util.Scanner;

public class userinput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID");
		
		int n = sc.nextInt();
		System.out.println("n = "+ n);
		
		System.out.println("Enter Name");
		
		String name = sc.next();
		
		System.out.println("name is = "+ name);
		
	}

}

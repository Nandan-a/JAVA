package com.cdac.inh;
import java.util.Scanner;

public class invalidDateException {
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int sub (int a,int b) {
		return a-b;
	}
	public static int mul (int a,int b) {
		return a*b;
	}
	public static int div (int a,int b) {
		return a/b;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number");
		int a = input.nextInt();
		System.out.println("Enter any number again!!");
		int b = input.nextInt();
		
		while(true){
			
			System.out.println(" 1. Enter 1 to Add \n 2. Enter 2 to Sub \n 3. Enter 3 to Mul \n 4. Enter 4 to Div \n 5. Enter 5 to Exit \n ");
			int choice = input.nextInt();
			switch(choice) 
			{
			case 1:
				
				System.out.println("Addition : "+add(a,b));
				break;
			
			case 2:
			
				System.out.println("Sub : "+sub(a,b));				
				break;
			
			case 3:
			
				System.out.println("Mul : "+mul(a,b));
				break;
			
			case 4:
			
				System.out.println("Div : "+div(a,b));
				break;
			
			case 5:
			
				System.out.println("Byee");
				break;
			
			default:
				System.out.println("Enter a valid no");
			}
			if(choice == 5) {
				break;
			}
		}
	}
}


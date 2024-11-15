package javaTask07;

import java.util.Scanner;

public class Qsn01 {

	public static void main(String[] args) {
		
		handleException();

	}
	
	public static void handleException() {
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter first number :: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number :: ");
		int num2 = sc.nextInt();
		
		int result = num1/num2;
		System.out.println("Result is :: "+result);
		}
		catch(ArithmeticException e) {
		System.out.println("Error : cannot divide by zero");
		}
	}

}

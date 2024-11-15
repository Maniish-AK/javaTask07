package javaTask07;

import java.util.ArrayList;
import java.util.List;

public class Qsn02 {

	public static void main(String[] args) {
		
		ArrayIndexException();
		StringIndexException();

	}

	public static void ArrayIndexException() {

		try {
			int[] myArray = new int[2];
			myArray[0]=5;
			myArray[1]=10;

			for(int index=0;index<5;index++) {
				System.out.println(myArray[index]);
			}
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("I have handled IndexOutOfBoundsException exception");
		}
	}
	
	public static void StringIndexException() {
		String str = "Hello Guvi";
		
		try {
			char charIndex = str.charAt(12);
			System.out.println("Char at index 12 is :: "+charIndex);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("I have handled StringIndexOutOfBoundsException exception");
		}
	}

}

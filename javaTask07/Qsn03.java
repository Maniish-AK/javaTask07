package javaTask07;

public class Qsn03 {

	public static void main(String[] args) {

		InvalidAgeException(25);
		InvalidAgeException(11);

	}

	public static void InvalidAgeException(int age) {

		try {
			if(age<18) {

				throw new ArithmeticException("Invalid Age Exception");
			}
			else {
				System.out.println("Your age is :: "+age);
			}
		}
		catch (Exception e) {
			System.out.println("Invalid Age Exception handled");
		}

	}

}

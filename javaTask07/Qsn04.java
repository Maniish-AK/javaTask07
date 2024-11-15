package javaTask07;

import java.io.File;
import java.util.Scanner;

public class Qsn04 {

	public static void main(String[] args) {
		
		FileNotFoundMethod();

	}

	public static void FileNotFoundMethod() {

		try {
			File file = new File("F:/Files/Topic.txt");
			Scanner sc = new Scanner(file); 

			String title = sc.nextLine();
			System.out.println(title);
			for(int i=0;i<10;i++){
				System.out.println(sc.nextLine());
			}
		}
		catch(Exception e) {
			System.out.println("File does not exists :: FileNotFoundException");
		}
			
		}

	}

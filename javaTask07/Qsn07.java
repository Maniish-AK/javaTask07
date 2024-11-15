package javaTask07;

import java.util.ArrayList;
import java.util.List;

public class Qsn07 {

	public static void main(String[] args) {
		
		ListToArray();

	}

	public static void ListToArray() {

		List<String> list = new ArrayList<>();

		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Date");
		
		System.out.println("List elements :: "+list);

		String[] array = new String[list.size()];
		array = list.toArray(array);

		System.out.println("Array elements:");
		for (String element : array) {
			System.out.println(element);
		}
	}

}

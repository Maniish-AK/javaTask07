package javaTask07;

import java.util.ArrayList;
import java.util.List;

public class Qsn05 {

	public static void main(String[] args) {
		
		RemoveAllElements();

	}

	public static void RemoveAllElements() {
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Date");
		
		System.out.println("Original ArrayList: " + list);
		
		list.clear();
		
		System.out.println("ArrayList after removing all elements: " + list);
	}

}

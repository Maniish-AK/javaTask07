package javaTask07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class Qsn06 {

	public static void main(String[] args) {
		
		TreeMapImplementation();

	}
	
	public static void TreeMapImplementation() {
		
		TreeMap<Integer, String> myTree = new TreeMap<Integer, String>();
		myTree.put(101, "Himanshu");
		myTree.put(102, "Maniish");
		myTree.put(103, "Anish");
		myTree.put(104, "Jegan");
		myTree.put(105, "Prasanthi");
		myTree.put(106, "Balu");
		
		System.out.println("Employee list :: "+myTree);
		
		List<String> myList = new ArrayList<String>(myTree.values());
		Collections.sort(myList);
		System.out.println("Employees in alphabetical order :: "+myList);
	}

}

package com.deepti.collections;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SecondSmallestElement {

	public static void findSecondSmallestElement(int elementArrays[]) {
		final String METHOD_NAME = "findSecondSmallestElement";
		System.out.println("Method Invoked: " + METHOD_NAME);

		SortedSet<Integer> mainSet = new TreeSet<Integer>();
		for (int i : elementArrays) {
			mainSet.add(i);
		}
		// System.out.println("The sortedSet: " + mainSet);
		Object[] objectSet = mainSet.toArray();
		// System.out.println("This is OBj: " + objectSet.toString());
		// System.out.println("This is OBj: " + (objectSet[1]));

		int result = (Integer) objectSet[1];

		System.out.println("The Second Smallest is: " + result);

		/*
		 * Set<Integer> mainSet = new HashSet<Integer>(); for (int counter = 0; counter
		 * < elementArrays.length; counter++) { mainSet.add(elementArrays[counter]); }
		 * Object setObject[] = mainSet.toArray(); int setResult = (Integer)
		 * setObject[1]; for (int counter = 0; counter < setObject.length; counter++) {
		 * System.out.println("Element at: " + counter + " is: " + setObject[counter]);
		 * }
		 */
	}

	public static void main(String[] args) {
		System.out.println("Main Starts");
		System.out.println("Enter number of elements");
		Scanner scanner = new Scanner(System.in);
		int numberOfElements = scanner.nextInt();

		int elementArrays[] = new int[numberOfElements];
		for (int counter = 0; counter < numberOfElements; counter++) {
			if (counter == 0) {
				System.out.println("Enter the first Element");
				elementArrays[counter] = scanner.nextInt();
			} else {
				System.out.println("Enter next Element");
				elementArrays[counter] = scanner.nextInt();
			}
		}

		findSecondSmallestElement(elementArrays);
		scanner.close();
		System.exit(0);
		System.out.println("Main Ends");
	}
}

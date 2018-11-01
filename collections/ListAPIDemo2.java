package com.deepti.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListAPIDemo2 {

	public static void main(String[] args) {
		System.out.println("ListAPIDemo2 Main Starts");

		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Deepti");
		arrayList.add("Sanjay");
		arrayList.add("Dhammo");
		arrayList.add(0, "India");
		arrayList.add(null);

		Iterator<String> iterator = arrayList.iterator();

		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println("String: " + "\t" + string);
		}

		List<String> linkedList = new LinkedList<String>();
		linkedList.add("USA");
		linkedList.add("UK");
		linkedList.add("Dubai");
		System.out.println("LinkedList: " + linkedList);

		List<String> mainList = new ArrayList<String>();
		System.out.println("AddAll Result: " + mainList.addAll(arrayList));
		System.out.println("MainList: " + mainList);
		System.out.println("AddAll Result: " + mainList.addAll(linkedList));
		System.out.println("MainList: " + mainList);
		System.out.println("Contains All result: " + mainList.containsAll(mainList));

		System.out.println("Retain All: " + mainList.retainAll(linkedList));
		System.out.println("MAin List: " + mainList);
		System.out.println("Retain All will remove all the objects/Elements other than passed Collection");

		System.out.println("ListAPIDemo2 Main Ends");
	}

}

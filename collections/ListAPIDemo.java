package com.deepti.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListAPIDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		System.out.println("ListAPIDemo Main Starts");
		List list = new ArrayList();
		list.add("Deepti");
		int size = list.size();
		System.out.println("list Size: " + size);
		System.out.println("isEmpty: " + list.isEmpty());
		System.out.println("List: " + list);
		System.out.println("contains Deepti " + list.contains("Deepti"));
		System.out.println("contains Deepti " + list.contains("Deepti"));
		System.out.println("Contains null " + list.contains(null));
		list.add(null);
		System.out.println("Contains null " + list.contains(null));
		Iterator iterator = list.iterator();
		if (iterator.hasNext()) {
			System.out.println("Iterator value: " + iterator.next());
		}
		list.add(0, "Sharma");
		list.add(0, "Deepti");
		list.add(0, "Sagar");
		iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println("New Iterator Value: " + iterator.next());
		}
		Object[] listObject = list.toArray();
		for (Object obj : listObject) {
			System.out.println(obj);
			// String listString = (String) obj;
		}
		System.out.println("Remove Deepti Result: " + list.remove("Deepti"));
		System.out.println("Remove Deepti Result: " + list.remove("Deepti"));
		System.out.println("Remove Deepti Result: " + list.remove("Deepti"));
		list.add(0, "Deepti");

		System.out.println("Get 0 position: " + list.get(0));
		System.out.println("Set 0 position: " + list.set(0, "Deepti"));
		System.out.println("Get 0: " + list.get(0));

		List newSubList = list.subList(1, 4);
		System.out.println("New Sub List: " + newSubList);

		System.out.println("New Customer Added" + newSubList.add(new Customer("C101", "Deepti", 100001, 0101010101)));
		System.out.println("New Customer Added" + newSubList.add(new Customer("C102", "Deepti", 100002, 0101010101)));
		System.out.println("New Customer Added" + newSubList.add(new Customer("C103", "Dhammo", 100003, 0101010101)));
		System.out.println("New Sub List: " + newSubList);

		System.out.println("ListAPIDemo Main Ends");
	}

}

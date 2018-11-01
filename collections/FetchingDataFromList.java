package com.deepti.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class FetchingDataFromList {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		System.out.println("FetchingDataFromList Main Starts");
		List list = new ArrayList();
		list.add(new Customer("C101", "Deepti", 1000001, 101010101));
		list.add(new Customer("C102", "Sanjay", 10000009, 101011111));
		list.add(1001);
		list.add("Sharma");
		list.add("Sagar");
		list.add("Dhammo-007");
		list.add("Deepti-09");
		list.add(20001);
		list.add(1);
		list.add(01);
		list.add(41);
		list.add(16);
		list.add(931);
		list.add(1016666666);
		System.out.println("*************************************");
		System.out.println("Iterating by the List");
		System.out.println("*************************************");
		Iterator iterator = list.iterator();

		while (iterator.hasNext()) {
			Object obj = iterator.next();
			if (obj instanceof Customer) {
				Customer customer = (Customer) obj;
				System.out.println("Customer Name: " + "\t" + customer.getCustomerName());
				System.out.println("Customer Id:" + "\t" + customer.getCustomerId());
				System.out.println("Customer ContactNumber:" + "\t" + customer.getCustomerContactNumber());
				System.out.println("Customer ZipCode:" + "\t" + customer.getCustomerZipCode());
				System.out.println("\n");
			} else if (obj instanceof String) {
				String objStr = (String) obj;
				System.out.println("String: " + objStr);
			} else if (obj instanceof Integer) {
				int objInt = (Integer) obj;
				System.out.println("Int: " + objInt);
			} else {
				System.out.println("Other type: " + obj.toString());
			}
		}
		System.out.println("\n");

		System.out.println("*********************Iteraton Ends************************");
		System.out.println("*********************ListIteraton Starts************************");

		System.out.println("**************************************");
		System.out.println("Using ListIterator for the List - Forward");
		System.out.println("*************************************");
		ListIterator listIterator = list.listIterator();

		while (listIterator.hasNext()) {
			Object listIteratorObject = listIterator.next();
			if (listIteratorObject instanceof Customer) {
				System.out.println("Customer Class Object");
				Customer customerLisTIteratorObject = (Customer) listIteratorObject;
				System.out.println("Customer Name: " + "\t" + customerLisTIteratorObject.getCustomerName());
				System.out.println("Customer Id: " + "\t" + customerLisTIteratorObject.getCustomerId());
				System.out.println("Customer Number: " + "\t" + customerLisTIteratorObject.getCustomerContactNumber());
				System.out.println("Customer ZipCode: " + "\t" + customerLisTIteratorObject.getCustomerZipCode());
				System.out.println("\n");
			} else if (listIteratorObject instanceof String) {
				String stringlistIteratorObject = (String) listIteratorObject;
				System.out.println("String: " + stringlistIteratorObject);
			} else if (listIteratorObject instanceof Integer) {
				int intlistIteratorObject = (Integer) listIteratorObject;
				System.out.println("Integer: " + intlistIteratorObject);
			} else {
				System.out.println("Other type: " + listIteratorObject);
			}
		}
		System.out.println("**************************************");
		System.out.println("Using ListIterator for the List - Backward");
		System.out.println("*************************************");

		while (listIterator.hasPrevious()) {
			Object listIteratorObject = listIterator.previous();
			if (listIteratorObject instanceof Customer) {
				Customer customerlistIteratorObject = (Customer) listIteratorObject;
				System.out.println("Customer Name: " + "\t" + customerlistIteratorObject.getCustomerName());
				System.out.println("Customer Id: " + "\t" + customerlistIteratorObject.getCustomerId());
				System.out.println("Customer Number: " + "\t" + customerlistIteratorObject.getCustomerContactNumber());
				System.out.println("Customer ZipCode: " + "\t" + customerlistIteratorObject.getCustomerZipCode());
				System.out.println("\n");
			} else if (listIteratorObject instanceof String) {
				String stringListIteratorObject = (String) listIteratorObject;
				System.out.println("Strin: " + stringListIteratorObject);
			} else if (listIteratorObject instanceof Integer) {
				int intlistIteratorObject = (Integer) listIteratorObject;
				System.out.println("Integer: " + intlistIteratorObject);
			} else {
				System.out.println("Other type: " + listIteratorObject);
			}

		}

		System.out.println("*********************ListIteraton Endss************************");
		System.out.println("**************************************");
		System.out.println("Using forEach loop for the List");
		System.out.println("*************************************");

		for (Object obj : list) {
			if (obj instanceof Customer) {
				Customer customerObject = (Customer) obj;
				System.out.println("Customer Name: " + "\t" + customerObject.getCustomerName());
				System.out.println("Customer Id: " + "\t" + customerObject.getCustomerId());
				System.out.println("Customer Number: " + "\t" + customerObject.getCustomerContactNumber());
				System.out.println("Customer ZipCode: " + "\t" + customerObject.getCustomerZipCode());
				System.out.println("\n");
			} else if (obj instanceof String) {
				String stringObject = (String) obj;
				System.out.println("Strin: " + stringObject);
			} else if (obj instanceof Integer) {
				int intObject = (Integer) obj;
				System.out.println("Integer: " + intObject);
			} else {
				System.out.println("Other type: " + obj);
			}
		}

		System.out.println("*************************************");
		System.out.println("FetchingDataFromList Main Ends");
	}

}

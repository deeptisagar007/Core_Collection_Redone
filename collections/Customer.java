package com.deepti.collections;

public final class Customer {
	private String customerId;
	private String customerName;
	private long customerZipCode;
	private long customerContactNumber;

	@SuppressWarnings("unused")
	private Customer() {
		System.out.println("Defult constructor");
	}

	/**
	 * @param customerId
	 * @param customerName
	 * @param customerZipCode
	 * @param customerContactNumber
	 */
	public Customer(String customerId, String customerName, long customerZipCode, long customerContactNumber) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerZipCode = customerZipCode;
		this.customerContactNumber = customerContactNumber;
	}

	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @return the customerZipCode
	 */
	public long getCustomerZipCode() {
		return customerZipCode;
	}

	/**
	 * @return the customerContactNumber
	 */
	public long getCustomerContactNumber() {
		return customerContactNumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerZipCode="
				+ customerZipCode + ", customerContactNumber=" + customerContactNumber + "]";
	}

}

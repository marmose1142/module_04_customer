package by.epam.customer.entity;

import java.util.Arrays;

public class CustomerList {
	private Customer[] customers = { new Customer(123, "Ipatov Maxim", "White street", 12345, 12),
			new Customer(122, "Ipatova Anna", "Black street", 23415, 11),
			new Customer(111, "Romanov Nikola", "Red street", 11111, 10),
			new Customer(678, "Livov Egor", "Yellow street", 10099, 14),
			new Customer(100, "Cobain Kurt", "Grey street", 23478, 18) };

	public CustomerList() {
	}

	public CustomerList(Customer[] customers) {
		this.customers = customers;
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(customers);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerList other = (CustomerList) obj;
		return Arrays.equals(customers, other.customers);
	}

	@Override
	public String toString() {
		return "CustomerList [customers=" + Arrays.toString(customers) + "]";
	}

}

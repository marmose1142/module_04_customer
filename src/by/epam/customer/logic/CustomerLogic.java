package by.epam.customer.logic;

import by.epam.customer.entity.*;

public class CustomerLogic {

	public void customersAlphabeticalOrder(CustomerList customerList) {
		for (int i = 0; i < customerList.getCustomers().length - 1; i++) {
			for (int j = i + 1; j < customerList.getCustomers().length; j++) {
				if (customerList.getCustomers()[j].getName()
						.compareToIgnoreCase((customerList.getCustomers()[i].getName())) < 0) {
					Customer temp = customerList.getCustomers()[i];
					customerList.getCustomers()[i] = customerList.getCustomers()[j];
					customerList.getCustomers()[j] = temp;
				}
			}
		}
	}

	public CustomerList searchCardGivenInterval(CustomerList customerList, int min, int max) {
		CustomerList cardCustomerList = new CustomerList(new Customer[customerСounter(customerList, min, max)]);
		int j = 0;

		for (int i = 0; i < customerList.getCustomers().length; i++) {
			if (customerList.getCustomers()[i].getCreditCardNumber() > min
					& customerList.getCustomers()[i].getCreditCardNumber() < max) {
				cardCustomerList.getCustomers()[j] = customerList.getCustomers()[i];
				j++;
			}
		}
		return cardCustomerList;
	}

	private int customerСounter(CustomerList customerList, int min, int max) {
		int result = 0;
		for (int i = 0; i < customerList.getCustomers().length; i++) {
			if (customerList.getCustomers()[i].getCreditCardNumber() > min
					& customerList.getCustomers()[i].getCreditCardNumber() < max) {
				result++;
			}
		}
		return result;
	}

}

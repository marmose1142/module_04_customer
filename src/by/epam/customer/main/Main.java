package by.epam.customer.main;

import by.epam.customer.entity.*;
import by.epam.customer.logic.CustomerLogic;
import by.epam.customer.view.*;

/*Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод toString.Создать второй класс агрегирующий массив типа Customer, с подходящими конструктарами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer:id, фамилия,имя,отчество,адрес,номер кредитной карты,номер банковского счета.
 * Найти и вывести:
 * a)список покупателей в алфавитном порядке;
 * б)список покупателей, у которых номер кредитной карточки находится в заданном интервале.*/

public class Main {

	public static void main(String[] args) {
		CustomerList customerList = new CustomerList();
		CustomerLogic customerLogic = new CustomerLogic();
		CustomerView customerView = new CustomerView();

		customerLogic.customersAlphabeticalOrder(customerList);
		customerView.printCustomerView(customerList);
		CustomerList cardInterval = customerLogic.searchCardGivenInterval(customerList, 20000, 29999);
		customerView.printCustomerView(cardInterval);

	}

}

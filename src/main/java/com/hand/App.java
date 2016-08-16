package com.hand;

import java.util.Date;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.AddressDao;
import dao.CustomerDao;
import mode.Address;
import mode.Customer;

public class App {
	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		CustomerDao customerDao = (CustomerDao) a.getBean("customerDao");
		Customer customer = new Customer();
		Scanner scan = new Scanner(System.in);

		System.out.print("first_name: ");
		String first_name = scan.nextLine();
		customer.setFirst_name(first_name);

		System.out.print("last_name: ");
		String last_name = scan.nextLine();
		customer.setLast_name(last_name);

		System.out.print("email: ");
		String email = scan.nextLine();
		customer.setEmail(email);

		boolean b = true;
		while (b) {
			AddressDao addressDao = (AddressDao) a.getBean("addressDao");
			System.out.print("address_id: ");
			int address_id = scan.nextInt();
			Address address = addressDao.selectById(address_id);
			if (address != null) {
				customer.setAddress_id(address_id);
				customer.setCreate_date(new Date());
				customerDao.addCustomer(customer);
				b = false;
			} else {
				System.out.println("请重新输入！！");
				b = true;
			}
		}
		System.exit(0);
	}
}

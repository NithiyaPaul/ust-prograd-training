package com.example.Bank;

import com.example.Bank.BankController.CustomerController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(BankApplication.class, args);
		System.out.println("**************Welcome to ABC Banking Service***********************");
		Customer customer = context.getBean(Customer.class);
		Account account = context.getBean(Account.class);

		customer.Customer(1,"Nithiya","7012690801");
		customer.Customer(2,"Nimisha","8086523281");

		account.Account(1,"675645677","ABC00034","Ernakulam","Savings");
		account.Account(2,"406775677","ABC00023","Trissur","Current");

		account.deposit(1,500);
		account.deposit(1,1000);

		account.withdrawal(1,500);

		account.fundTransfer(1,2,500);

		customer.showCustomerDetails();
	}

}

/*Create a Spring Boot application for ABC Bank. using this application, the customers of the bank should be able to access their account details and transfer funds to the other accounts of the same bank. This application should consist of the following entities:
Customer: To store information about the customers of the bank
Account:To store information about the existing accounts of the bank
FundTransfer: To store information about the funds that are transferred from one account to the other.
Create the application and inject dependencies in the entities.*/
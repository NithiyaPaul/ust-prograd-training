package com.example.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
@Scope("prototype")
public class Customer {
    Map<Integer, List<String>> c_array = new HashMap<Integer, List<String>>(); // customer array
    Map<Integer, List<String>> a_array = new HashMap<Integer, List<String>>(); // account array
    Map<Integer, List<String>> temp_array = new HashMap<Integer, List<String>>(); // temporary array


    @Autowired
    private Account account;

    public void Customer(int accId, String name, String phoneNumber) {
        c_array.put(accId, Arrays.asList(name, phoneNumber));
    }

    public void showCustomerDetails() {
        a_array = account.getAccountDetails();
        for (Integer key : c_array.keySet()) {
            if (a_array.containsKey(key)) {
                ArrayList<String> c_list = new ArrayList<String>(c_array.get(key));
                ArrayList<String> a_list = new ArrayList<String>(a_array.get(key));
                c_list.addAll(a_list);
                temp_array.put(key, c_list);
            }
        }
        System.out.println("===========Customer Details================");
        for (Integer key : temp_array.keySet()) {
            System.out.println("Customer ID :" + key);
            System.out.println("Customer Name :" + temp_array.get(key).get(0));
            System.out.println("Phone Number :" + temp_array.get(key).get(1));
            System.out.println("Account Number : " + temp_array.get(key).get(2));
            System.out.println("IFSC Code :" + temp_array.get(key).get(3));
            System.out.println("Current Balance :" + temp_array.get(key).get(4));
            System.out.println("Bank Branch :" + temp_array.get(key).get(5));
            System.out.println("Account Type:" + temp_array.get(key).get(6));
            System.out.println("===============================================");
        }
    }
}

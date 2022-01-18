package com.example.Bank.service;

import com.example.Bank.entity.Customer;
import com.example.Bank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public Customer findCustomerByEmail(String email){
        return customerRepository.findByEmail(email);
    }

    public Customer getCustomerById(Long id){
        return  customerRepository.getById(id);
    }

    public List<Customer> listAll(){
        return customerRepository.findAll();
    }

}

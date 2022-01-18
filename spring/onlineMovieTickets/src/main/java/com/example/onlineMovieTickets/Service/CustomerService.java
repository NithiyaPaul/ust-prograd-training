package com.example.onlineMovieTickets.Service;

import com.example.onlineMovieTickets.Entity.Customer;
import com.example.onlineMovieTickets.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.getById(id);
    }

    public Customer findCustomerByEmail(String email){
        return customerRepository.findByEmail(email);
    }

}


package com.saiko.bank.customer.customer.service;

import com.saiko.bank.customer.customer.entity.Customer;
import com.saiko.bank.customer.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public String save(Customer customer) {
        customerRepository.save(customer);
        return "saved successfully";
    }
}

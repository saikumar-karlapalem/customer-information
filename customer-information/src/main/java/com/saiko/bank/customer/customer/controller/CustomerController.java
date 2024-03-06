package com.saiko.bank.customer.customer.controller;

import com.saiko.bank.customer.customer.entity.Customer;
import com.saiko.bank.customer.customer.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("saiko/customer/information")
public class CustomerController {


    @Autowired
    private CustomerServiceImpl customerService;

    @PostMapping("/save/customer")
    public String save(@RequestBody Customer customer)
    {
        return customerService.save(customer);
    }
}

package com.saiko.bank.customer.customer.service;

import com.saiko.bank.customer.customer.entity.Address;
import com.saiko.bank.customer.customer.entity.BankAccounts;
import com.saiko.bank.customer.customer.entity.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CustomerServiceImplTest {

    @Autowired
    private CustomerServiceImpl customerService;

    @BeforeEach
    void setUp() {
    }

    @Test
    public void customer_added_to_db()
    {
        Customer c1=new Customer(UUID.randomUUID(),"mal_roy","male",987654321L,
                new Address(UUID.randomUUID(),"AP","Guntur","Tenali","567647"),new BankAccounts(UUID.randomUUID(), List.of(787865432L,8998765432L)));



        assertEquals("saved successfully",customerService.save(c1));

    }
}
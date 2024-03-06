package com.saiko.bank.customer.customer.repository;

import com.saiko.bank.customer.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}

package com.saiko.bank.customer.customer.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.util.List;
import java.util.UUID;
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID customer_id;
    private String full_name;
    private String gender;
    private long mobile_number;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private Address customer_address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bank_accounts_id_locator", referencedColumnName = "bank_accounts_id_locator")
    private BankAccounts bank_accounts;


    public Customer(UUID customer_id, String full_name, String gender, long mobile_number, Address customer_address, BankAccounts bank_accounts) {

        this.customer_id = customer_id;
        this.full_name = full_name;
        this.gender = gender;
        this.mobile_number = mobile_number;
        this.customer_address = customer_address;
        this.bank_accounts = bank_accounts;
    }

    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", full_name='" + full_name + '\'' +
                ", gender='" + gender + '\'' +
                ", mobile_number=" + mobile_number +
                ", customer_address=" + customer_address +
                ", bank_accounts=" + bank_accounts +
                '}';
    }

    public UUID getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(UUID customer_id) {
        this.customer_id = customer_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(long mobile_number) {
        this.mobile_number = mobile_number;
    }

    public Address getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(Address customer_address) {
        this.customer_address = customer_address;
    }

    public BankAccounts getBank_accounts() {
        return bank_accounts;
    }

    public void setBank_accounts(BankAccounts bank_accounts) {
        this.bank_accounts = bank_accounts;
    }
}

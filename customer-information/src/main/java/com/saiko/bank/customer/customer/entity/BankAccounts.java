package com.saiko.bank.customer.customer.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;


@Entity
public class BankAccounts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID bank_accounts_id_locator;

    private List<Long> bank_accounts_list;

    @OneToOne(mappedBy = "bank_accounts")
    private Customer customer;

    public UUID getBank_accounts_id_locator() {
        return bank_accounts_id_locator;
    }

    public void setBank_accounts_id_locator(UUID bank_accounts_id_locator) {
        this.bank_accounts_id_locator = bank_accounts_id_locator;
    }

    public List<Long> getBank_accounts_list() {
        return bank_accounts_list;
    }

    public void setBank_accounts_list(List<Long> bank_accounts_list) {
        this.bank_accounts_list = bank_accounts_list;
    }

    @Override
    public String toString() {
        return "BankAccounts{" +
                "bank_accounts_id_locator=" + bank_accounts_id_locator +
                ", bank_accounts_list=" + bank_accounts_list +
                '}';
    }

    public BankAccounts(UUID bank_accounts_id_locator, List<Long> bank_accounts_list) {
        this.bank_accounts_id_locator = bank_accounts_id_locator;
        this.bank_accounts_list = bank_accounts_list;
    }

    public BankAccounts() {
    }
}

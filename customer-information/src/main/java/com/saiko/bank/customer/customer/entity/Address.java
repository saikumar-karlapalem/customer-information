package com.saiko.bank.customer.customer.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID address_id;

    private String state;
    private String city;
    private String native_place;
    private String pin_code;

    @OneToOne(mappedBy = "customer_address")
    private Customer customer;

    public UUID getAddress_id() {
        return address_id;
    }

    public void setAddress_id(UUID address_id) {
        this.address_id = address_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNative_place() {
        return native_place;
    }

    public void setNative_place(String native_place) {
        this.native_place = native_place;
    }

    public String getPin_code() {
        return pin_code;
    }

    public void setPin_code(String pin_code) {
        this.pin_code = pin_code;
    }

    public Address(UUID address_id, String state, String city, String native_place, String pin_code) {
        this.address_id = address_id;
        this.state = state;
        this.city = city;
        this.native_place = native_place;
        this.pin_code = pin_code;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "address_id=" + address_id +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", native_place='" + native_place + '\'' +
                ", pin_code='" + pin_code + '\'' +
                '}';
    }
}

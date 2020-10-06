package se.hkr.sarahfashion.server.models;

import java.util.ArrayList;
import java.util.Collections;

public class Customer {
    private String ssn;
    private String name;
    private String address;
    private GenderEnum gender;
    private final ArrayList<Order> orders = new ArrayList<>();

    public enum GenderEnum {male, female}

    public Customer() {}

    public Customer(String ssn, String name, String address, GenderEnum gender, Order[] currentOrders) {
        this.ssn = ssn;
        this.name = name;
        this.address = address;
        this.gender = gender;
        Collections.addAll(this.orders, currentOrders);
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
}

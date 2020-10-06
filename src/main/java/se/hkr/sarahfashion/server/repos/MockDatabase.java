package se.hkr.sarahfashion.server.repos;

import se.hkr.sarahfashion.server.models.Customer;
import se.hkr.sarahfashion.server.models.Order;

import java.util.ArrayList;

public class MockDatabase {
    public final ArrayList<Customer> customers = new ArrayList<>();
    public final ArrayList<Order> orders = new ArrayList<>();
}

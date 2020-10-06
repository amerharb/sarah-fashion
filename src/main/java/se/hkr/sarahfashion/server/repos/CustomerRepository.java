package se.hkr.sarahfashion.server.repos;


import org.springframework.stereotype.Component;
import se.hkr.sarahfashion.server.models.Customer;
import se.hkr.sarahfashion.server.models.Order;
import java.util.List;

@Component
public class CustomerRepository {
    private final MockDatabase mockDatabase = new MockDatabase();

    public CustomerRepository() {
        // add mock data
        Order order1 = new Order();
        Order order2 = new Order();
        // TODO: add order to customer
        Customer customer1 = new Customer();
        mockDatabase.customers.add(customer1);

        Order order3 = new Order();
        Order order4 = new Order();
        // TODO: add order to customer
        Customer customer2 = new Customer();
        mockDatabase.customers.add(customer2);
    }

    public void save(Customer customer) {
        mockDatabase.customers.add(customer);
    }

    public void delete(String customerSsn) {
        mockDatabase.customers.stream()
                .filter(customer -> customer.getSsn().equals(customerSsn))
                .findFirst()
                .ifPresent(mockDatabase.customers::remove);
    }

    public Customer getBySnn(String customerSsn) {
        return mockDatabase.customers.stream()
                .filter(customer -> customer.getSsn().equals(customerSsn))
                .findFirst()
                .orElse(null);
    }

    public List<Customer> getAll(){
        return mockDatabase.customers;
    }
}

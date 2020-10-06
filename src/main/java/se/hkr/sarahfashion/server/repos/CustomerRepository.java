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
        Order order1 = new Order(
                1,
                "2020-09-01",
                24.3,
                Order.PaymentStatus.paid
                );
        Order order2 = new Order(
                2,
                "2020-09-02",
                400,
                Order.PaymentStatus.notPaid
        );
        Order[] currentOrdersOfCustomer1 = {order1, order2};
        Customer customer1 = new Customer(
                "1111",
                "John Smith",
                "Smith Family St.",
                Customer.GenderEnum.male,
                currentOrdersOfCustomer1
        );
        mockDatabase.customers.add(customer1);

        Order order3 = new Order(
                3,
                "2020-09-03",
                10,
                Order.PaymentStatus.paid
        );
        Order order4 = new Order(
                4,
                "2020-09-04",
                2000,
                Order.PaymentStatus.notPaid
        );
        Order[] currentOrdersOfCustomer2 = {order3, order4};
        Customer customer2 = new Customer(
                "2222",
                "Åsa Johansson",
                "Åsa Mansion",
                Customer.GenderEnum.female,
                currentOrdersOfCustomer2
        );
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

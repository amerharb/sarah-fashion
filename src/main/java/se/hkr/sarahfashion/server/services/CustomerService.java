package se.hkr.sarahfashion.server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import se.hkr.sarahfashion.server.exceptions.CustomerAlreadyExistsException;
import se.hkr.sarahfashion.server.exceptions.CustomerNotFoundException;
import se.hkr.sarahfashion.server.models.Customer;
import se.hkr.sarahfashion.server.repos.CustomerRepository;

@Component
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void addCustomer(Customer customer) {
        Customer find = customerRepository.getBySnn(customer.getSsn());
        if (find != null) throw new CustomerAlreadyExistsException("customer with same ssn: " + customer.getSsn() + " exists");
        customerRepository.save(customer);
    }

    public void updateAddress(String ssn, String newAddress) {
        Customer customer = customerRepository.getBySnn(ssn);
        if (customer == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No such customer with ssn: " + ssn);
        customer.setAddress(newAddress);
    }

    public void removeCustomer(String ssn) throws CustomerNotFoundException {
        Customer customer = customerRepository.getBySnn(ssn);
        if (customer == null) throw new CustomerNotFoundException("No such customer with ssn: " + ssn);
        customerRepository.delete(ssn);
    }

    public Customer getCustomer(String ssn) throws CustomerNotFoundException {
        Customer customer = customerRepository.getBySnn(ssn);
        if (customer == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No such customer with ssn: " + ssn);
        return customer;
    }

    public Iterable<Customer> getAllCustomers() {
        return customerRepository.getAll();
    }
}

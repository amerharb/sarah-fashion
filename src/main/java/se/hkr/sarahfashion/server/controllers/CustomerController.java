package se.hkr.sarahfashion.server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.hkr.sarahfashion.server.models.Order;
import se.hkr.sarahfashion.server.models.Customer;
import se.hkr.sarahfashion.server.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService service;

    @Autowired
    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @PostMapping
    public void addCustomer(@RequestBody Customer customer) {
        service.addCustomer(customer);
    }

    @GetMapping
    public Iterable<Customer> getAllCustomers() {
        return service.getAllCustomers();
    }

    @GetMapping("/{ssn}")
    public Customer getCustomerById(@PathVariable String ssn) {
        return service.getCustomer(ssn);
    }

    @DeleteMapping("/{ssn}")
    public void deleteCustomerById(@PathVariable String ssn) {
        service.removeCustomer(ssn);
    }
}

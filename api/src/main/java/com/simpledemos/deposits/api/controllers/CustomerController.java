package com.simpledemos.deposits.api.controllers;

import com.simpledemos.deposits.api.models.CustomerEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class CustomerController {

    @GetMapping("customer")
    public ResponseEntity<List<CustomerEntity>> getCustomers() {
        List<CustomerEntity> customers = new ArrayList<CustomerEntity>();
        customers.add(new CustomerEntity(1, "Bob", "Bob Rock"));
        customers.add(new CustomerEntity(2, "To,", "Tomas Rock"));
        customers.add(new CustomerEntity(3, "Scott", "Walter Scott"));
        return ResponseEntity.ok(customers);
    }

    @GetMapping("customer/{id}")
    public CustomerEntity customerDetail(@PathVariable int id){
        return new CustomerEntity(id, "Tom", "Soyer");
    }

    @PostMapping("customer/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<CustomerEntity> createCustomer(@RequestBody CustomerEntity customer){
        System.out.println(customer.getFullName());
        return new ResponseEntity<CustomerEntity>(customer, HttpStatus.CREATED);
    }

    @PutMapping("customer/{id}/update")
    public ResponseEntity<CustomerEntity> updateCustomer(@RequestBody CustomerEntity customer,
                                                         @PathVariable("id") int customerId){
        System.out.println(customer.getFullName()+ "is updated");
        return ResponseEntity.ok(customer);

    }

    @DeleteMapping("customer/{id}/delete")
    public ResponseEntity<String> deleteCustomer(@PathVariable("id") int id){
        System.out.println(id + "is deleted");
        return ResponseEntity.ok("Customer deleted successfully");
    }
}

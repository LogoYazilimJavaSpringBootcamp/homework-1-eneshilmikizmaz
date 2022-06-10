package Service;

import Model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers(Customer customer);
    List<Customer> getCustomersContainsCInName(Customer customer);


}

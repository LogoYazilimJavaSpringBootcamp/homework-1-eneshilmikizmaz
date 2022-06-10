package Service;

import Model.Company;
import Model.Customer;
import Model.Order;

import java.util.Map;
import java.util.Set;

public interface CompanyService {
    Map<Integer,Customer> getAllBillsAtJuneByCustomerId(Customer customer);
    Map<Integer,Order> getAllBillsByOrderId(Order order);
    Map<Integer,Order> getBillsUpperValueByOrderId(Order order);
    int getBillsUpperAvgByOrderId(Order order);
    Set<String> getBillsLowerValueByCustomerName(Customer customer);
    Set<String> getBillsLowerAvgByCompanySector(Company company);

}

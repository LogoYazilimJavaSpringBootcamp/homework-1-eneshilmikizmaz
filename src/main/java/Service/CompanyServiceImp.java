package Service;

import Model.Company;
import Model.Customer;
import Model.Order;

import java.util.Map;
import java.util.Set;

public class CompanyServiceImp implements CompanyService {
    @Override
    public Map<Integer, Customer> getAllBillsAtJuneByCustomerId(Customer customer) {
        return null;
    }

    @Override
    public Map<Integer, Order> getAllBillsByOrderId(Order order) {
        return null;
    }

    @Override
    public Map<Integer, Order> getBillsUpperValueByOrderId(Order order) {
        return null;
    }

    @Override
    public int getBillsUpperAvgByOrderId(Order order) {
        return 0;
    }

    @Override
    public Set<String> getBillsLowerValueByCustomerName(Customer customer) {
        return null;
    }

    @Override
    public Set<String> getBillsLowerAvgByCompanySector(Company company) {
        return null;
    }
}

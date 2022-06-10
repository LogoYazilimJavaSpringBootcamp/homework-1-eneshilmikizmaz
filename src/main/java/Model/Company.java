package Model;

import java.util.List;

public class Company {
    private int companyId;
    private String name;
    private String sector;

    private Order order;
    private List<Order> orderList;

    public Company(int companyId, String name, String sector, Order order, List<Order> orderList) {
        this.companyId = companyId;
        this.name = name;
        this.sector = sector;
        this.order = order;
        this.orderList = orderList;
    }


    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundryservicesystem;

/**
 *
 * @author ziadb
 */
public class Service {
    private int serviceId;
    private String itemName;
    private String category;
    private String serviceType;
    private double price;

    public Service(int serviceId, String itemName,
            String category, String serviceType, double price) {
        this.serviceId = serviceId;
        this.itemName = itemName;
        this.category = category;
        this.serviceType = serviceType;
        this.price = price;
    }

    public int getServiceId() {
        return serviceId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getCategory() {
        return category;
    }

    public String getServiceType() {
        return serviceType;
    }

    public double getPrice() {
        return price;
    }

}

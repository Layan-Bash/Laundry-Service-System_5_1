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
public class OrderDetail {

    private int serviceId;
    private int quantity;
    private double subtotal;

    public OrderDetail(int serviceId, int quantity, double subtotal) {
        this.serviceId = serviceId;
        this.quantity = quantity;
        this.subtotal = subtotal;
    }

    public int getServiceId() {
        return serviceId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSubtotal() {
        return subtotal;
    }

}

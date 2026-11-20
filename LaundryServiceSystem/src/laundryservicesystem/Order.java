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
import java.time.LocalDate;
import java.util.List;
public class Order {

    private int orderId;
    private int customerId;
    private LocalDate orderDate;
    private double totalAmount;
    private String status;
    private PaymentMethod paymentMethod;
    private LocalDate expectedPickupDate;
    private OrderType orderType;
    private List<OrderDetail> details;

    public Order(int orderId, int customerId, LocalDate orderDate,
            double totalAmount, String status,
            PaymentMethod paymentMethod,
            LocalDate expectedPickupDate,
            OrderType orderType, List<OrderDetail> details) {

        this.orderId = orderId;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.status = status;
        this.paymentMethod = paymentMethod;
        this.expectedPickupDate = expectedPickupDate;
        this.orderType = orderType;
        this.details = details;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public LocalDate getExpectedPickupDate() {
        return expectedPickupDate;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public List<OrderDetail> getDetails() {
        return details;
    }

}

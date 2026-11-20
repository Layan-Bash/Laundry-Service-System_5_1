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
public class Subscription {

    private int subscriptionId;
    private int customerId;
    private LocalDate purchaseDate;
    private double amountPaid;
    private double creditBalance;
    private LocalDate expiryDate;

    public Subscription(int subscriptionId, int customerId,
            LocalDate purchaseDate, double amountPaid,
            double creditBalance, LocalDate expiryDate) {

        this.subscriptionId = subscriptionId;
        this.customerId = customerId;
        this.purchaseDate = purchaseDate;
        this.amountPaid = amountPaid;
        this.creditBalance = creditBalance;
        this.expiryDate = expiryDate;
    }

    public int getSubscriptionId() {
        return subscriptionId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public double getCreditBalance() {
        return creditBalance;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setCreditBalance(double creditBalance) {
        this.creditBalance = creditBalance;
    }

}

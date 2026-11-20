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
public class Customer {

    private int customerId;
    private String name;
    private String phoneNumber;
    private double accountBalance;

    public Customer(int customerId, String name,
            String phoneNumber, double accountBalance) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.accountBalance = accountBalance;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

}

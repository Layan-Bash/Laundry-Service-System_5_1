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
import java.time.YearMonth;
public class LaundryServiceSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OrderProcessing orderProcessing = new OrderProcessing();
        BalanceAdjustment balanceAdjustment = new BalanceAdjustment();
        SubscriptionManagement subscriptionManagement = new SubscriptionManagement();
        FinancialReport financialReporting = new FinancialReport();

        // Example of calling the methods after implementation
        // Order order = orderProcessing.createOrder(...);
        // boolean result = balanceAdjustment.adjustBalance(...);
        // Subscription subscription =
        //         subscriptionManagement.purchaseSubscription(...);
        // MonthlyReport report =
        //         financialReporting.generateMonthlyReport(
        //                 YearMonth.now());
    }
}



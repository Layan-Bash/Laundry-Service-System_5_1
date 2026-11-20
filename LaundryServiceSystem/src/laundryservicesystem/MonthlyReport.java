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
public class MonthlyReport {
    private double directIncome;
    private double subscriptionIncome;
    private double debtRecorded;
    private double totalUnpaidDebt;

    public MonthlyReport(double directIncome,
            double subscriptionIncome,
            double debtRecorded,
            double totalUnpaidDebt) {

        this.directIncome = directIncome;
        this.subscriptionIncome = subscriptionIncome;
        this.debtRecorded = debtRecorded;
        this.totalUnpaidDebt = totalUnpaidDebt;
    }

    public double getDirectIncome() {
        return directIncome;
    }

    public double getSubscriptionIncome() {
        return subscriptionIncome;
    }

    public double getDebtRecorded() {
        return debtRecorded;
    }

    public double getTotalUnpaidDebt() {
        return totalUnpaidDebt;
    }

}

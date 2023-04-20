/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelClass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Mohd Mohsin Ismail
 */
public class Payment {

    private int paymentId;
    private double amount;
    private BankAccount bankAccount;
    private Date date;
    private StatusEnum status;

    public Payment(double amount, BankAccount bankAccount, Date date, StatusEnum status) {
        this.amount = amount;
        this.bankAccount = bankAccount;
        this.date = date;
        this.status = status;
    }

    public Payment(int paymentId, double amount, Date date, StatusEnum status) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.date = date;
        this.status = status;
    }

    public Payment() {
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getDateString() {
        DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy hh:mm");
        return dateFormat.format(date);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

}

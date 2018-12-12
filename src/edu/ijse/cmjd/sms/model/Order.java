/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.cmjd.sms.model;

import java.io.Serializable;

/**
 *
 * @author Dulitha Dissanayake
 */
public class Order implements Serializable {

    private String oid;
    private String cusId;
    private String purchaseDate;
    private String lstPaymentDate;
    private String basicTotal;
    private String discount;
    private String interest;
    private String installmentCost;
    private String orderTotal;
    private String alreadyPaid;

    public Order() {
    }

    public Order(String oid, String cusId, String purchaseDate, String lstPaymentDate, String basicTotal, String discount, String interest,
            String installmentCost, String orderTotal, String alreadyPaid) {
        this.oid = oid;
        this.cusId = cusId;
        this.purchaseDate = purchaseDate;
        this.lstPaymentDate = lstPaymentDate;
        this.basicTotal = basicTotal;
        this.discount = discount;
        this.interest = interest;
        this.installmentCost = installmentCost;
        this.orderTotal = orderTotal;
        this.alreadyPaid = alreadyPaid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public void setCusID(String cusId) {
        this.cusId = cusId;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setLastPaymentDate(String lstPaymentDate) {
        this.lstPaymentDate = lstPaymentDate;
    }

    public void setBasicTotal(String basicTotal) {
        this.basicTotal = basicTotal;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public void setCostOfInstallment() {
        this.installmentCost = installmentCost;
    }

    public void setOrderTotal(String orderTotal) {
        this.orderTotal = orderTotal;
    }

    public void setAlreadyPayment(String alreadyPaid) {
        this.alreadyPaid = alreadyPaid;
    }

    public String getOid() {
        return this.oid;
    }

    public String getCusID() {
        return this.cusId;
    }

    public String getPurchaseDate() {
        return this.purchaseDate;
    }

    public String getLastPaymentDate() {
        return this.lstPaymentDate;
    }

    public String getBasicTotal() {
        return this.basicTotal;
    }

    public String getDiscount() {
        return this.discount;
    }

    public String getInterest() {
        return this.interest;
    }

    public String getCostOfInstallment() {
        return installmentCost;
    }

    public String getOrderTotal() {
        return this.orderTotal;
    }

    public String getAlreadyPayment() {
        return this.alreadyPaid;
    }

}

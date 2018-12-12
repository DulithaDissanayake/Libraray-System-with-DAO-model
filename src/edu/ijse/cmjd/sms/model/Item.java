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
public class Item implements Serializable {

    private String code;
    private String description;
    private String unitPrice;
    private String qtyOnHand;

    public Item() {
    }

    public Item(String code, String description, String unitPrice, String qtyOnHand) {
        this.code = code;
        this.description = description;
        this.unitPrice = unitPrice;
        this.qtyOnHand = qtyOnHand;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQtyOnHand(String qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public String getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public String getUnitPrice() {
        return this.unitPrice;
    }

    public String getQtyOnHand() {
        return this.qtyOnHand;
    }

}

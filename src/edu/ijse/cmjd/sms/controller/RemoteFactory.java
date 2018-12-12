/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.cmjd.sms.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Dulitha Dissanayake
 */
public interface RemoteFactory extends Remote{
    public CustomerController getCustomerController() throws RemoteException;
    public ItemController getItemController() throws RemoteException;
    public OrderController getOrderController() throws RemoteException;
    public TemporyItemController getTempItemController() throws RemoteException;
}

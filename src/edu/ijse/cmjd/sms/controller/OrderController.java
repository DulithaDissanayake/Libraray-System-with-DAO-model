/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.cmjd.sms.controller;

import edu.ijse.cmjd.sms.model.Order;
import edu.ijse.cmjd.sms.observer.OrderObserver;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Dulitha Dissanayake
 */
public interface OrderController extends Remote{
    public boolean addOrder(Order order) throws RemoteException,ClassNotFoundException,SQLException;
    //public boolean deleteOrder(String oid) throws RemoteException,ClassNotFoundException,IOException;
    public boolean updateOrder(Order order) throws RemoteException,ClassNotFoundException,SQLException;
    public Order searchOrder(String code) throws RemoteException,ClassNotFoundException,SQLException;
    public ArrayList<Order> viewAllOrders() throws RemoteException,ClassNotFoundException,SQLException;
    public boolean reserveOrder(String code) throws RemoteException;
    public boolean releaseOrder(String code) throws RemoteException;
    public void addOrderObserver(OrderObserver customerObserver) throws RemoteException;
    public void removeOrderObserver(OrderObserver customerObserver) throws RemoteException;
}

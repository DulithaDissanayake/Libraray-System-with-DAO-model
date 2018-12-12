/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.cmjd.sms.controller;

import edu.ijse.cmjd.sms.model.TemporyItem;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;

/**
 *
 * @author Dulitha Dissanayake
 */
public interface TemporyItemController extends Remote{
    public boolean addToTemp(TemporyItem tempItem) throws RemoteException,ClassNotFoundException,SQLException;
    public boolean removeTemp(String code) throws RemoteException,ClassNotFoundException,SQLException;
    public boolean isInclude(String code) throws RemoteException,ClassNotFoundException,SQLException;
    public boolean update(String code,int qty) throws RemoteException,ClassNotFoundException,SQLException;
    public void updateUnsavedQty(String code,int qty) throws RemoteException,ClassNotFoundException,SQLException;
    public void removeReArrangedQty(String code,int qty) throws RemoteException,ClassNotFoundException,SQLException;
    public int searchTempQty(String code) throws RemoteException,ClassNotFoundException,SQLException;
    public boolean addToMapTemp(String code,ItemController itemController) throws RemoteException,ClassNotFoundException,SQLException;
    public boolean removeFromMap(String code,ItemController itemController) throws RemoteException,ClassNotFoundException,SQLException;
    public boolean isIncludeInMap(String code) throws RemoteException,ClassNotFoundException,SQLException;
    public void printArray() throws RemoteException,ClassNotFoundException,SQLException;
}

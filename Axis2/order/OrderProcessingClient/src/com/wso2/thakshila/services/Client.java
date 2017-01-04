package com.wso2.thakshila.services;

import org.apache.axis2.AxisFault;

import java.rmi.RemoteException;

/**
 * Created by thakshila on 9/19/16.
 */
public class Client {
    public static void main(String[] args) {
        try {
           OrderServiceStub stub = new OrderServiceStub();
//            OrderServiceStub.AddItems addItems = new OrderServiceStub.AddItems();
//            addItems.setItemName("blah");
//            addItems.setPrice(100);
//            stub.addItems(addItems);
//            OrderServiceStub.AddItemsResponse response= stub.addItems()
//           System.out.println(response.get_return());

            OrderServiceStub.CalculateOrderAmount calculateOrderAmount = new OrderServiceStub.CalculateOrderAmount();
            calculateOrderAmount.setItemName("aee");
            calculateOrderAmount.setQuantity(38);
            OrderServiceStub.CalculateOrderAmountResponse response = stub.calculateOrderAmount(calculateOrderAmount);
            System.out.println(response.get_return());

        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}

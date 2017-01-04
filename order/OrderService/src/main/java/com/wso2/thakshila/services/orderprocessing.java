package com.wso2.thakshila.services;

import java.util.HashMap;

/**
 * Created by thakshila on 9/14/16.
 */
public class orderprocessing {

    private static HashMap<String, Double> stock;

    static {
        stock = new HashMap<String, Double>();
    }

    public String addItems(String itemName, double price) {

        if (price > 0) {


            stock.put(itemName, price);
            return "Item " + itemName + " is successfully added";
        }

        return "Invalid price (" + price + ") for item: " + itemName;

    }

    public String calculateOrderAmount(String itemName, int quantity) {

        double totItemAmount = 0;
        double totOrderAmount = 0;

        double price = stock.get(itemName);

        if (quantity > 0) {

            totItemAmount = price * quantity;

            totOrderAmount += totItemAmount;

            return "Total order cost: " + totOrderAmount;
        }

        return "Invalid quantity (" + quantity + ") for item: " + itemName;

    }

    public String displayStock() {
        return "Items in the stock: " + stock.toString();
    }

}


/**
 * OrderServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:08:57 BST)
 */

    package com.wso2.thakshila.services;

    /**
     *  OrderServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class OrderServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public OrderServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public OrderServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for displayStock method
            * override this method for handling normal response from displayStock operation
            */
           public void receiveResultdisplayStock(
                    com.wso2.thakshila.services.OrderServiceStub.DisplayStockResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from displayStock operation
           */
            public void receiveErrordisplayStock(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addItems method
            * override this method for handling normal response from addItems operation
            */
           public void receiveResultaddItems(
                    com.wso2.thakshila.services.OrderServiceStub.AddItemsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addItems operation
           */
            public void receiveErroraddItems(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for calculateOrderAmount method
            * override this method for handling normal response from calculateOrderAmount operation
            */
           public void receiveResultcalculateOrderAmount(
                    com.wso2.thakshila.services.OrderServiceStub.CalculateOrderAmountResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from calculateOrderAmount operation
           */
            public void receiveErrorcalculateOrderAmount(java.lang.Exception e) {
            }
                


    }
    
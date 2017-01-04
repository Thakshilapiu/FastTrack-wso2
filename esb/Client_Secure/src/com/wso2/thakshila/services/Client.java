package com.wso2.thakshila.services;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.axis2.Constants;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.HttpTransportProperties;

import com.wso2.thakshila.services.OrderServiceStub.CalculateOrderAmount;


public class Client {

	
	 public static void main(String[] args) throws RemoteException {
	        try {
	        	

	            System.setProperty("javax.net.ssl.trustStore",
	                    "/opt/wso2esb-5.0.0/repository/resources/security/wso2carbon.jks");
	            System.setProperty("javax.net.ssl.trustStorePassword", "wso2carbon");
	            // set axis2 repository
	            ConfigurationContext ctx;
	            ctx = ConfigurationContextFactory.createConfigurationContextFromFileSystem(
	                    "/opt/axis2-1.7.3/repository", null);

	           OrderServiceStub stub = new OrderServiceStub("http://thakshila-Latitude-E6540:8280/services/SecureClient ");
	        	CalculateOrderAmount obj = new CalculateOrderAmount();
	            // send wso2 server authentication details with request header
	            HttpTransportProperties.Authenticator authenticator = new HttpTransportProperties.Authenticator();
	            authenticator.setUsername("admin");
	            authenticator.setPassword("admin");

	            stub._getServiceClient().getOptions().setProperty(HTTPConstants.AUTHENTICATE, authenticator);
	            stub._getServiceClient().getOptions()
	.setProperty(Constants.Configuration.ENABLE_REST, Constants.VALUE_TRUE);
	        	
	        	
	        	
	        	
	            obj.setItemName("test1");
	            //obj.setItemName("aee");
	            obj.setQuantity(38);
	           // System.out.println(stub.calculateOrderAmount(obj).get_return());
	            OrderServiceStub.CalculateOrderAmountResponse response = stub.calculateOrderAmount(obj);
	            System.out.println(response.get_return());
	        } catch (AxisFault e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

	    }

	}
package samples.quickstart.client;

import samples.quickstart.StockQuoteServiceStub;

/**
 * Created by thakshila on 9/13/16.
 */
public class StockQuoteClient {
    public static void main(String[] args) {
        try {
            samples.quickstart.StockQuoteServiceStub stub =
                    new samples.quickstart.StockQuoteServiceStub();
            samples.quickstart.StockQuoteServiceStub.GetPrice request =
                    new samples.quickstart.StockQuoteServiceStub.GetPrice();
            request.setSymbol("ABCD");
            samples.quickstart.StockQuoteServiceStub.GetPriceResponse
                    response =
                    stub.getPrice(request);
            System.out.println(response.get_return());
        } catch (org.apache.axis2.AxisFault
                e) {
            e.printStackTrace();
        } catch (java.rmi.RemoteException
                e) {
            e.printStackTrace();
        }
    }
}
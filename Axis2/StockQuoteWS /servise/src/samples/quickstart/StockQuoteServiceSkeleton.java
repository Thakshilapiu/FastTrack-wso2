/**
 * StockQuoteServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:08:57 BST)
 */
package samples.quickstart;

/**
 *  StockQuoteServiceSkeleton java skeleton for the axisService
 */
public class StockQuoteServiceSkeleton
    implements StockQuoteServiceSkeletonInterface {
    /**
     * Auto generated method signature
     *
     * @param getPrice0
     * @return getPriceResponse1
    **/
    public samples.quickstart.xsd.GetPriceResponse
    getPrice(samples.quickstart.xsd.GetPrice getPrice0) {
    samples.quickstart.xsd.GetPriceResponse response = new
    samples.quickstart.xsd.GetPriceResponse();
    response.set_return(100.00d);
    return response;
    }
    }
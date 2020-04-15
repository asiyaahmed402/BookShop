package edu.bu.met.cs665.Factories;

import edu.bu.met.cs665.FooterPackage.*;
import edu.bu.met.cs665.HeaderPackage.*;
import edu.bu.met.cs665.MainBodyPackage.*;
/**
 * This is the factory for the returning customer entity
 * It assembles the header, body, and footer of the email
 */

public class ReturningCustFactory implements BuildTheFactories {
    //get the header for the returning customer entity email
    @Override
    public EmailHeader getHeader(String HeaderType) {
        if(HeaderType == null){
            return null;
        }
        if(HeaderType.equalsIgnoreCase("ReturningCustomerHeader")){
            return new ReturningHeader();
        } else return null;

    }
    //get the body for the returning customer entity email
    @Override
    public EmailBody getBody(String BodyType) {
        if(BodyType == null){
            return null;
        }
        if(BodyType.equalsIgnoreCase("ReturningCustomerBody")){
            return new ReturningEmailBody();
        } else return null;

    }
    //get the footer for the returning customer entity email
    @Override
    public FooterAbstractClass getFooter(String FooterType) {
        if(FooterType == null){
            return null;
        }
        if(FooterType.equalsIgnoreCase("ReturningCustomerFooter")){
            return new ReturningFooter();
        } else return null;

    }
}

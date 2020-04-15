package edu.bu.met.cs665.Factories;

import edu.bu.met.cs665.FooterPackage.*;
import edu.bu.met.cs665.HeaderPackage.*;
import edu.bu.met.cs665.MainBodyPackage.*;
/**
 * This is the factory for the new customer entity
 * It assembles the header, body, and footer of the email
 */

public class NewCustFactory implements BuildTheFactories {
    //get the header for the new customer entity email
    @Override
    public EmailHeader getHeader(String HeaderType) {
        if(HeaderType == null){
            return null;
        }
        if(HeaderType.equalsIgnoreCase("NewCustomerHeader")){
            return new NewCustomerHeader();
        } else return null;

    }
    //get the body for the new customer entity email
    @Override
    public EmailBody getBody(String BodyType) {
        if(BodyType == null){
            return null;
        }
        if(BodyType.equalsIgnoreCase("NewCustomerBody")){
            return new NewCustBody();
        } else return null;

    }
    //get the footer for the new customer entity email
    @Override
    public FooterAbstractClass getFooter(String FooterType) {
        if(FooterType == null){
            return null;
        }
        if(FooterType.equalsIgnoreCase("NewCustomerFooter")){
            return new NewCustFooter();
        } else return null;

    }
}

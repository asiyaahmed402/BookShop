package edu.bu.met.cs665.Factories;

import edu.bu.met.cs665.FooterPackage.*;
import edu.bu.met.cs665.HeaderPackage.*;
import edu.bu.met.cs665.MainBodyPackage.*;
/**
 * This is the factory for the businesss customer entity
 * It assembles the header, body, and footer of the email
 */
public class BusinessFactory implements BuildTheFactories {
    public BusinessFactory() {
        super();
    }
    //get the header for the business entity email
    @Override
    public EmailHeader getHeader(String HeaderType) {
        if(HeaderType == null){
            return null;
        }
        if(HeaderType.equalsIgnoreCase("BusinessHeader")){
            return new BusinessHeader();
        } else return null;

    }
    //get the body for the business entity email
    @Override
    public EmailBody getBody(String BodyType) {
        if(BodyType == null){
            return null;
        }
        if(BodyType.equalsIgnoreCase("BusinessBody")){
            return new BusinessBody();
        } else return null;

    }
    //get the footer for the business entity email
    @Override
    public FooterAbstractClass getFooter(String FooterType) {
        if(FooterType == null){
            return null;
        }
        if(FooterType.equalsIgnoreCase("BusinessFooter")){
            return new BusinessFooter();
        } else return null;

    }


}

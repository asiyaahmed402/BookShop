package edu.bu.met.cs665;


import edu.bu.met.cs665.Factories.*;
import edu.bu.met.cs665.FooterPackage.*;
import edu.bu.met.cs665.HeaderPackage.*;
import edu.bu.met.cs665.MainBodyPackage.*;

import java.io.*;
// import org.apache.log4j.PropertyConfigurator;


/**
 * @author Asiya Ahmed
 */

public class Main {

  /**
   * This main method tests one of the entities for the email generator
   *
   * @param args not used
   */

  public static void main(String[] args) throws IOException, Exception{

    FactoryProducer object = FactoryProducer.getInstance();
    //get business factory
    BuildTheFactories BusinessTest = FactoryProducer.getFactory("Business");
    //get header object
    EmailHeader head1 = BusinessTest.getHeader("BusinessHeader");
    System.out.println("E-mail Header");
    head1.generateNames();
    head1.generateRandomDate();
    head1.generateEncryption();
    System.out.println();
    System.out.println();

    //BODY
    EmailBody body1 = BusinessTest.getBody("BusinessBody");
    body1.readEmailBody();
    body1.encryptBodyOfEmail();

    System.out.println();
    System.out.println();
    //Footer
    FooterAbstractClass footer1 = BusinessTest.getFooter("BusinessFooter");
    footer1.socialMedia();
    footer1.LegalDisclaimer();
















  }





}

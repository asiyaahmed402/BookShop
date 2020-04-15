package edu.bu.met.cs665.Factories;

import edu.bu.met.cs665.FooterPackage.*;
import edu.bu.met.cs665.HeaderPackage.*;
import edu.bu.met.cs665.MainBodyPackage.*;

/**
 * This interface will build factories for different entities in
 * the email generator application
 * This interface has three abstract methods
 */

public interface BuildTheFactories {
    abstract EmailHeader getHeader(String HeaderType);
    abstract EmailBody getBody(String BodyType);
    abstract FooterAbstractClass getFooter(String FooterType);




}

package edu.bu.met.cs665;

import edu.bu.met.cs665.Factories.*;
import edu.bu.met.cs665.FooterPackage.*;
import edu.bu.met.cs665.HeaderPackage.*;
import edu.bu.met.cs665.MainBodyPackage.*;
import org.junit.*;

public class MainTest {
    private FactoryProducer factoryProducer = new FactoryProducer();
    private BuildTheFactories returningCustFactoryTest;
    private BuildTheFactories frequentCustFactoryTest;

    @Before
    public void setUp() throws Exception {
        returningCustFactoryTest = FactoryProducer.getFactory("ReturningCustomer");
        frequentCustFactoryTest = FactoryProducer.getFactory("Frequent");
    }

    @Test
    public void EmailHeader(){
        FrequentHeader frequentHeaderTest = new FrequentHeader();
        Assert.assertTrue(frequentHeaderTest instanceof EmailHeader);

        //test returning customer header
        ReturningHeader returningHeaderTest = new ReturningHeader();
        Assert.assertTrue(returningHeaderTest instanceof EmailHeader);

    }

    @Test
    public void EmailBody(){
        //Test frequent customer body email
        FrequentBody frequentBodyTest = new FrequentBody();
        Assert.assertTrue(frequentBodyTest instanceof EmailBody);

        //Test returning customer body email
        ReturningEmailBody returningEmailBodyTest = new ReturningEmailBody();
        Assert.assertTrue(returningEmailBodyTest instanceof EmailBody);
    }

    @Test
    public void FooterInterface(){
        //Test frequent customer footer
        FrequentFooter frequentFooterTest = new FrequentFooter();
        Assert.assertTrue(frequentFooterTest instanceof FooterAbstractClass);

        //Test returning customer footer
        ReturningFooter returningFooterTest = new ReturningFooter();
        Assert.assertTrue(returningFooterTest instanceof FooterAbstractClass);
    }

    @Test
    public void BusinessBody() throws Exception{
        BusinessBody businessBody = new BusinessBody();
        businessBody.encryptBodyOfEmail();
        Assert.assertTrue(businessBody instanceof EmailBody);

    }










}
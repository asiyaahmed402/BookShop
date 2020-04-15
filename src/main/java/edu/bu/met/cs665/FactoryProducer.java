package edu.bu.met.cs665;

import edu.bu.met.cs665.Factories.*;
/**
 * This class assembles the factories
 */

public class FactoryProducer {
    private static FactoryProducer instance = new FactoryProducer();
    public FactoryProducer(){}

    public static FactoryProducer getInstance(){
        return instance;
    }


    /**
     * This method assembles the factories by using simple if/else statements
     * @return factories (or null)
     */

    public static BuildTheFactories getFactory(String choice){
        if(choice.equalsIgnoreCase("Business")){
            return new BusinessFactory();
        } else if(choice.equalsIgnoreCase("VIP")){
            return new VIPFactory();
        } else if(choice.equalsIgnoreCase("Frequent")){
            return new FrequentCustFactory();
        } else if(choice.equalsIgnoreCase("NewCustomer")){
            return new NewCustFactory();
        } else if(choice.equalsIgnoreCase("ReturningCustomer")){
            return new ReturningCustFactory();
        }
        return null;
    }
}

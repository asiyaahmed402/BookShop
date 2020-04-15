package edu.bu.met.cs665.MainBodyPackage;
/**
 * This abstract class has two abstract methods that
 * make up the body of the email.
 * @exception Exception
 */

public abstract class EmailBody {

    public abstract void readEmailBody() throws Exception;
    public abstract void encryptBodyOfEmail() throws Exception;


}

package edu.bu.met.cs665.HeaderPackage;

import java.io.*;
/**
 * This is an abstract class for the email header
 * This class has three abstract methods
 * @exception IOException
 */
public abstract class EmailHeader {
    public abstract void generateNames() throws IOException;
    public abstract void generateRandomDate();
    public abstract void generateEncryption();
}

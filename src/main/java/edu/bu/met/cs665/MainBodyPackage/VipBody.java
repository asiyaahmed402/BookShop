package edu.bu.met.cs665.MainBodyPackage;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.io.*;
import java.security.*;
import java.security.spec.*;
import java.util.*;
/**
 * This class is the body of the vip customer entity email
 * @exception Exception
 */
public class VipBody extends EmailBody {
    /**
     * This method uses scanner to read a file that has the content
     * of the body of the email
     * @exception Exception
     */
    @Override
    public void readEmailBody() throws Exception{
        Scanner sc = new Scanner(new File("src\\main\\java\\edu\\bu\\met\\cs665\\MainBodyPackage\\VIPText"));
        while(sc.hasNext()){
            String str = sc.nextLine();
            System.out.println(str);
        }
        sc.close();
    }
    /**
     * This method encrypts the text file that contains the body of the email
     * using AES. This is a concept that im new to which is why i did not add decryption
     * @exception Exception
     */
    @Override
    public void encryptBodyOfEmail() throws Exception {
        // file to be encrypted
        FileInputStream inFile = new FileInputStream("src\\main\\java\\edu\\bu\\met\\cs665\\MainBodyPackage\\VIPText");

        // encrypted file
        FileOutputStream outFile = new FileOutputStream("encryptedfile.des");

        // password to encrypt the file
        String password = "javapapers";

        // password, iv and salt should be transferred to the other end
        // in a secure manner

        // salt is used for encoding
        // writing it to a file
        // salt should be transferred to the recipient securely
        // for decryption
        byte[] salt = new byte[8];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(salt);
        FileOutputStream saltOutFile = new FileOutputStream("salt.enc");
        saltOutFile.write(salt);
        saltOutFile.close();

        SecretKeyFactory factory = SecretKeyFactory
                .getInstance("PBKDF2WithHmacSHA1");
        KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt, 65536,
                256);
        SecretKey secretKey = factory.generateSecret(keySpec);
        SecretKey secret = new SecretKeySpec(secretKey.getEncoded(), "AES");

        //
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secret);
        AlgorithmParameters params = cipher.getParameters();

        // iv adds randomness to the text and just makes the mechanism more
        // secure
        // used while initializing the cipher
        // file to store the iv
        FileOutputStream ivOutFile = new FileOutputStream("iv.enc");
        byte[] iv = params.getParameterSpec(IvParameterSpec.class).getIV();
        ivOutFile.write(iv);
        ivOutFile.close();

        //file encryption
        byte[] input = new byte[64];
        int bytesRead;

        while ((bytesRead = inFile.read(input)) != -1) {
            byte[] output = cipher.update(input, 0, bytesRead);
            if (output != null)
                outFile.write(output);
        }

        byte[] output = cipher.doFinal();
        if (output != null)
            outFile.write(output);

        inFile.close();
        outFile.flush();
        outFile.close();

        System.out.println("File Encrypted.");



    }
}

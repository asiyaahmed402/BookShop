package edu.bu.met.cs665.FooterPackage;

import java.io.*;
import java.util.*;

public class VipCustFooter extends FooterAbstractClass {
    /**
     * This method will print a random social media handle
     * from an array of strings
     */
    @Override
    public void socialMedia() {
        System.out.println("Add us on social Media: ");
        String[] arr={"Twitter: @CarsUSA", "Instagram: @CarsUSA", "Facebook: Cars USA", "Snapchat: @CarsUSA123"};
        Random r=new Random();
        int randomNumber=r.nextInt(arr.length);
        System.out.println(arr[randomNumber]);

    }

    /**
     * This method will output a legal disclaimer which is
     * saved in a text file. Scanner is used to scan the document
     * and will saved it to an arraylist
     * @exception IOException
     */

    @Override
    public void LegalDisclaimer() throws IOException {

        ArrayList<String> legal = new ArrayList<>();
        Random r = new Random();

        try (Scanner s = new Scanner(new FileReader("src\\main\\java\\edu\\bu\\met\\cs665\\FooterPackage\\Confidentiality"))) {
            while (s.hasNext()) {
                legal.add(s.nextLine());
            }
            // Pick one at random
            int randomIndex = (int) (Math.random() * legal.size());
            String randomName = legal.get(randomIndex);

            // Output the result
            System.out.println(randomName);


        }

    }
}

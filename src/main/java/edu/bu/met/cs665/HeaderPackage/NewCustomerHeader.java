package edu.bu.met.cs665.HeaderPackage;

import java.io.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.*;
import java.util.*;
import java.util.concurrent.*;
/**
 * This is new customer header class has three methods
 * @exception IOException
 */
public class NewCustomerHeader extends EmailHeader {
    /**
     * This method generates a random name to use
     * in the email header. the names are saved
     * in a text file
     * @exception IOException
     */
    @Override
    public void generateNames() throws IOException {
        //C:\Users\Asiya Ahmed\IdeaProjects\AllThingsArrays\src\Magac\Names

        ArrayList<String> result = new ArrayList<>();
        Random r = new Random();

        try (Scanner s = new Scanner(new FileReader("src\\main\\java\\edu\\bu\\met\\cs665\\HeaderPackage\\HRTeam"))) {
            while (s.hasNext()) {
                result.add(s.nextLine());
            }
            // Pick one at random
            int randomIndex = (int) (Math.random() * result.size());
            String randomName = result.get(randomIndex);

            // Output the result
            System.out.println(randomName);


        }
    }


    /**
     * This method generates a random date to use in the email header
     */
    @Override
    public void generateRandomDate() {
        LocalDate from = LocalDate.of(2016, 1, 1);
        LocalDate to = LocalDate.of(2020, 4, 6);
        long days = from.until(to, ChronoUnit.DAYS);
        long randomDays = ThreadLocalRandom.current().nextLong(days + 1);
        LocalDate randomDate = from.plusDays(randomDays);
        System.out.println(randomDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    }
    /**
     * This method generates a random email encryption type which
     * is saved as an array of strings. Usually in a real email
     * this would go in the header of the email
     */
    @Override
    public void generateEncryption() {
        System.out.println("E-mail Encryption Type:");
        String[] arr={"SMTP STARTTLS", "S/MIME", "PGP"};
        Random r=new Random();
        int randomNumber=r.nextInt(arr.length);
        System.out.println(arr[randomNumber]);

    }


}

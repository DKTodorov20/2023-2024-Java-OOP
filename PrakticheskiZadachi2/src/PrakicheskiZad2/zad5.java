package PrakicheskiZad2;

import java.util.Scanner;
import java.util.Random;

public class zad5 {
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = random.nextInt(100);

        int guess;
        int attempts = 0;
        do {
            System.out.print("Write a number: ");
            guess = Integer.parseInt(scanner.nextLine());
            attempts++;

            if (guess < secretNumber) {
                System.out.println("The number is higher,try again!");
            } else if (guess > secretNumber) {
                System.out.println("The number is lower, try again!");
            } else {
                System.out.println("You guess the number " + secretNumber + " after " + attempts + " attempts");
            }
        } while (guess != secretNumber);

    }
}

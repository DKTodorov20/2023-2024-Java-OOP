package PrakicheskiZad2;

import java.util.Scanner;

public class zad9 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in celsium: ");

        double temperature = Double.parseDouble(scanner.nextLine());

        double fahrenheit =  temperature * 33.8;

        System.out.println("Enter temperature in fahrenhait is : " + fahrenheit);

    }
}

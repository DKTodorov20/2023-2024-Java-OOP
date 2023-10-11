package PrakicheskiZad2;

import java.util.Scanner;


public class zad8 {
    public static void main(String[] args)
    {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter a: ");

     int a = Integer.parseInt(scanner.nextLine());

     System.out.println("Enter b: ");

        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("S = " + (a * b));

    }
}

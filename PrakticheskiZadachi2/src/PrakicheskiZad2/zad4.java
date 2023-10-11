package PrakicheskiZad2;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);


        System.out.println( "Enter number1: ");
        int num1 = Integer.parseInt(a.nextLine());
        System.out.println( "Enter number2: ");
        int num2 = Integer.parseInt(a.nextLine());
        System.out.println( "Enter method (+,-,*,/): ");
        String c = a.nextLine();


        if(c.equals("+"));
        {
            System.out.println(num1 + num2);
        }

         if(c.equals("-"))
        {
            System.out.println(num1 - num2);
        }

         if(c.equals("*"))
        {
            System.out.println(num1 * num2);
        }

         if(c.equals("/"))
        {
            System.out.println(num1 / num2);
        }

    }
}

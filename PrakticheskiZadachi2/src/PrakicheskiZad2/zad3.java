package PrakicheskiZad2;

import java.util.Scanner;

public class zad3 {

    public static void main(String[] args)
    {

        boolean check = true;
        Scanner a = new Scanner(System.in);
        int number = Integer.parseInt(a.nextLine());


        for(int i = 2 ; i  <= number - 1 ; i++)
        {
            if (number % i == 0) {
                 check = false;
            }
        }

        if(check == false)
        {
            System.out.println("The number is not prime" );
        }
        else
        {
            System.out.println("The number is prime.");
        }
    }
}

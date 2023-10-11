package PrakicheskiZad2;

import java.util.Scanner;


public class zad2 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 1 ;

        for(int i = 1 ; i <= n ; i++)
        {
            sum = sum * i;
        }

        System.out.println( "Factoriel  = " + sum);
    }
}

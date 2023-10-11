package PrakicheskiZad2;


import java.util.Scanner;


public class zad1 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        int number;

      do{
          number = Integer.parseInt(scanner.nextLine());
          sum = sum + number;
          counter++;
      }

      while(number != 0);


      System.out.println( sum / counter);
    }
}

package Task1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int number1 = Integer.parseInt(scan.nextLine());
        int number2 = Integer.parseInt(scan.nextLine());

        System.out.println( "sum = " + (number1 + number2));
        System.out.println( "substraction = " + (number1 - number2));
        System.out.println( "multiplication = " + number1 * number2);

        if(number2 != 0)
        {
            System.out.println( "division = " + (number1 / number2));
        }
        if(number2 != 0)
        {
            System.out.println( "division with % = " + (number1 % number2));
        }
    }
}

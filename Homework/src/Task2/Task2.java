package Task2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int radius = Integer.parseInt(scan.nextLine());
        int high = Integer.parseInt(scan.nextLine());
        double pi = 3.14;

        System.out.println("V = "  + ( pi * radius * radius * high));
    }
}

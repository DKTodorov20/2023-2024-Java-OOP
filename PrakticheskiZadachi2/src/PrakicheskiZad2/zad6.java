package PrakicheskiZad2;

import java.util.Scanner;

public class zad6 {
    public static boolean palindrome(String str) {
        int length = str.length();
        int counter = 0;
        length--;

        while (counter < length) {
            if (str.charAt(counter) != str.charAt(length)) {
                return false;
            }
            counter++;
            length--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(palindrome(str));
    }}

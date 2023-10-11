package PrakicheskiZad2;

import java.util.Scanner;
public class zad7 {
    public static String reverseWords(String sentence)
    {
        String[] words = sentence.split("\\s+");
        StringBuilder reverse= new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--)
        {
            reverse.append(words[i]).append(" ");
        }

        return reverse.toString().trim();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Write a sentance here: ");
        String sentence = input.nextLine();

        String reversedSentence = reverseWords(sentence);

        System.out.println(reversedSentence);
    }


}
package zad2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class Main {
    public static void main(String[] args) {

        String path = "H:\\file folder\\input.txt";

        try {

            FileReader reader = new FileReader(path);
            int character = reader.read();
            int sum = 0;
            while(character >= 0)
            {
                sum += character;
                character = reader.read();
            }
            System.out.println(sum);
            reader.close();
        }catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }catch(IOException e)
        {
            throw new RuntimeException(e);
        }

    }
}
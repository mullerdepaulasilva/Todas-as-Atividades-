package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions {
    public static void main(String[]args) throws IOException {

        FileReader file = new FileReader("C:\\test\\test.txt");
        BufferedReader fileInput = new BufferedReader(file);

        for (int counter = 0; counter <3; counter++){
            System.out.println(fileInput.readLine());

        }
    }
}

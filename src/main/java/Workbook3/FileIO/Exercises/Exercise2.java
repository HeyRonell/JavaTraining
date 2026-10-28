package Workbook3.FileIO.Exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome welcome.");

        // Asking the user for the name of the story that they'd like
        System.out.println("Enter the name of a story: (ex. goldilocks)");
        String fileName = read.nextLine().trim() + ".txt"; // reading the input and applying the .txt format.
        int lineNumber = 1; // keeping track of the numbers


        // the FileReader will try to locate the file.
        // Since it is already in our project, it doesn't need the additional pathing from our disk drive.
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String line; // to store the lines read within the file.

                while ((line = reader.readLine()) != null) { // stays true so long as there are still lines to read.
                    System.out.println(lineNumber + ", " + line);
                    lineNumber++; // Incrementing line number after each iteration.

                }
                reader.close(); // End Filereader

                // If the file can not be found, it will return this error.
            } catch (IOException e) {
                System.out.println("There was an error locating your file. Please verify the name.");
            }

            read.close(); // end scanner usage


    }
}

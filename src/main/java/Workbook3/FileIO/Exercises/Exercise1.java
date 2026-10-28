package Workbook3.FileIO.Exercises;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.util.regex.Pattern.quote;

public class Exercise1 {
    public static void main(String[] args) {


        String[] quotes = {
                "The only thing we have to fear is fear itself. - Franklin D. Roosevelt",
                "I think, therefore I am. - René Descartes",
                "Injustice anywhere is a threat to justice everywhere. -Martin Luther King Jr.",
                "That’s one small step for man, one giant leap for mankind. -Neil Armstrong",
                "Ask not what your country can do for you; ask what you can do for your country. -John F. Kennedy",
                "The unexamined life is not worth living. -Socrates (as recorded by Plato",
                "If I have seen further, it is by standing on the shoulders of giants. -Isaac Newton",
                "Float like a butterfly, sting like a bee. -Muhammad Ali",
                "Never in the field of human conflict was so much owed by so many to so few. -Winston Churchill",
                "Programs must be written for people to read, and only incidentally for machines to execute. -Harold Abelson"


        };

        Scanner read = new Scanner(System.in);
        String again = "yes";

        while (again.equalsIgnoreCase("yes")) {
            try {
                System.out.println("Pick a number from 1-10 to get a quote or 0 for a random one.");
                int choice = read.nextInt(); // Read me
                read.nextLine(); // Eat me

                if (choice == 0) {
                    choice = (int) (Math.random() * quotes.length) + 1;
                }
                System.out.println(quotes[choice - 1]); // to balance the zero index
                System.out.println("-------------------");

            } catch (Exception e) {
                System.out.println("Please provide a valid number");
                read.nextLine(); // to gobble

            }
            System.out.println("Would you like to do go again? yes or no."); // this will continue the while loop statement if yes.
            again = read.nextLine().trim(); // .trim is to remove the leading spaces.


        }

        System.out.println("Thank you for listening!");


        read.close();


    }

}
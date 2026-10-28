package Workbook3.FileIO;

import java.io.*; // * is grabbing filereader, bufferedreader, and IO exception all in one.
import java.time.*; // * is grabbing local date, time, and DateTime
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Reading and Writing files");

//        try {
//            // create a FileReader object connected to the file
//            FileReader fileReader = new FileReader("poem.txt");
//
//            // create a BufferedReader to manage the input stream
//            BufferedReader bufReader = new BufferedReader(fileReader);
//
//            String input;
//
//            // read until there is no more data
//            while ((input = bufReader.readLine()) != null) {
//                System.out.println(input);
//                System.out.println("The next line");
//            }
//
//            // close the stream and release the resources
//
//        }
//        catch (IOException e) {
//            // display stack trace if there was an error
//            e.printStackTrace();
//        }
//
//        try {
//            // open the file (use new FileWriter("skills.txt", true) to append)
//            FileWriter writer = new FileWriter("skills.txt");
//
//            // write to the file
//            writer.write("Skills:\n");
//            writer.write("Git, HTML, CSS, Bootstrap\n");
//            writer.write("JavaScript/ES6, jQuery, REST API, Node.js, Express\n");
//            writer.write("Angular\n");
//            writer.write("Java");
//
//            // close the file when you are finished using it
//            writer.close();
//        }
//        catch (IOException e) {
//            System.out.println("ERROR: An unexpected error occurred");
//            e.printStackTrace();
//        }
//
//        try {
//            FileWriter writer = new FileWriter("reasons.txt");
//
//            writer.write("My reasons for being a software developer:\n");
//            writer.write("1. Creating my own applications\n");
//            writer.write("2. Understanding how the software that I use regularly, work.\n");
//            writer.write("3. Sharing my ideas and passions with my peers.\n");
//
//
//
//
//
//            LocalTime currentTime = LocalTime.now();
//            System.out.println("The current time is: " + currentTime);
//
//            LocalDateTime rightNow = LocalDateTime.now();
//            System.out.println("Right now, it is: " + rightNow);
//
//            writer.close();
//        } catch (IOException e) {
//            System.out.println("Error, could not load.");
//            e.printStackTrace();
//        }

        LocalDate today = LocalDate.now(); // assigning a value to the variable "today" using the built-in method.
        System.out.println("Today is: " + today);

        try {
            FileWriter writer = new FileWriter(
                    "myreasonson-" + today.getDayOfWeek() + "-" + today.getDayOfMonth()
                            + "-of-" + today.getMonth() + "-" + today.getYear() + ".txt"); // creating a new file named...

            writer.write("My reasons for being a software developer:\n");
            writer.write("1. Creating my own applications\n");
            writer.write("2. Understanding how the software that I use regularly, work.\n");
            writer.write("3. Sharing my ideas and passions with my peers.\n");

            writer.close();

        } catch (IOException e) {
            System.out.println("there was an error reading this.");
        }

        DateTimeFormatter FileFormat = DateTimeFormatter.ofPattern("yyyy-MM");
        // File folder = new File(today.getYear() + "-" + today.getMonthValue());
        File folder = new File(today.format(FileFormat)); // top one less confusing
        // local date variable is today. argument is the format that we established on line 96.

        folder.mkdirs();

        File image = new File(folder, "zoom_screenshot.png");

        System.out.println(image.getPath()); // holy canoly it is in the java training folder on the computer.



    }
}
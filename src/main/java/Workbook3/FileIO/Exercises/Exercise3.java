package main.java.Workbook3.FileIO.Exercises;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class Exercise3 {
    public static void main(String[] args) {


        try { // Using BufferedReader and FileReader to find the path of the file to read.
            BufferedReader reader = new BufferedReader(new FileReader("src/main/java/resources/employees.csv"));
            reader.readLine();

            String line;

            while ((line = reader.readLine()) != null) { // While there are lines, it will continue to write it out.
                String[] parts = line.split("\\|");

                int id = Integer.parseInt(parts[0]); // Converting the id to a number
                String name = parts[1]; // made each section an array index
                double hoursWorked = Double.parseDouble(parts[2]); // Converting the hoursWorked from a string to a double.
                double payRate = Double.parseDouble(parts[3]); // Same conversion logic here as well.

                Employee employee = new Employee(id, name, hoursWorked, payRate);
                System.out.printf(Locale.US, "%d %-20s $%8.2f%n",
                        employee.getEmployeeid(), employee.getName(), employee.getGrossPay());
            }

            reader.close();
//          In case the file won't read.
            } catch(IOException e){
                System.out.println("File error. Double check that thang.");
                e.printStackTrace();
            }
        }
    }

    class Employee {
        private int employeeid;
        private String name;
        private double hoursWorked;
        private double payRate;

//        Overloaded constrictor with the parameters laid out.
        public Employee(int employeeid, String name, double hoursWorked, double payRate) {
            this.employeeid = employeeid;
            this.name = name;
            this.hoursWorked = hoursWorked;
            this.payRate = payRate;
    }

//    Getters for each of the constrictor objects
        public int getEmployeeid() {
            return employeeid;
        }

        public String getName() {
            return name;
        }

        public double getHoursWorked() {
            return hoursWorked;
        }

        public double getPayRate() {
            return payRate;
        }

        public double getGrossPay() {
            return hoursWorked * payRate;
        }
    }

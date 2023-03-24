package chapter2.example2;

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        // create scanner object
        Scanner input = new Scanner(System.in);

        // Declare variables
        double area;
        double radius;

        System.out.println("Enter number for radius: ");
        radius = input.nextDouble();

        area = radius * radius * 3.14159;

        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}

package chapter2;

import java.util.Scanner;

public class CalculateVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter of the sides and height of the Equilateral: ");
        double length = input.nextDouble();

        double area;
        double volume;

        area = (Math.pow(3, 1.0 / 2) / 4) * Math.pow(length, 2);

        volume = area * length;

        System.out.println("The area is: " + area);

        System.out.println("The volume of the Triangular prism is: " + volume);
    }
}

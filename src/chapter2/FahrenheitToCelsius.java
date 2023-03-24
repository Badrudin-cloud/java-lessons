package chapter2;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter miles: ");
        double miles = input.nextDouble();

        double kilometers = miles * 1.6;
        System.out.println(miles + " miles is " + ((int)(kilometers * 100) / 100.0) + " kilometers");







    }
}

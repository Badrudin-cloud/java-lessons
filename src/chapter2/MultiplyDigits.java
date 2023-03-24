package chapter2;

import java.util.Scanner;

public class MultiplyDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number between 0 and 1000: ");
        int number = input.nextInt();

        int ones = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = (number / 100) % 10;

        int product = hundreds * tens * ones;
        System.out.println("The product of all digits in " + number + " is " + product);
    }
}

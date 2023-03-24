package chapter3.example1;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 2 % 10);
        System.out.println("What is " + number1 + " + " + number2 + "? ");

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        int answer = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
    }
}

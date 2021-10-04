package main.java;
import java.util.Scanner;

public class InputExercise {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.println("Please enter two decimal numbers: ");
        System.out.println("First number: ");
        double num1 = myInput.nextDouble();
        System.out.println("Second number: ");
        double num2 = myInput.nextDouble();

        System.out.println("Add: " + sumDouble(num1, num2));
        System.out.println("Subtract: " + subtractDouble(num1, num2));
        System.out.println("Multiply: " + multiplyDouble(num1, num2));
        System.out.println("Divide: " + divideDouble(num1, num2));
    }

    public static double sumDouble(double x, double y) {return x+y;}

    public static double subtractDouble(double x, double y) {return x-y;}

    public static double multiplyDouble(double x, double y) {return x*y;}

    public static double divideDouble(double x, double y) {return x/y;}
}

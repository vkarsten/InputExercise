package main.java;

import java.util.Scanner;

public class InputExercise2 {
    public static void main(String[] args) {
        // Write an application that takes all the information about a specific user :
        // name , age , gender , education , email , profession , company
        // Then out put a CV
        Scanner myInput = new Scanner(System.in);

        System.out.println("Please enter the following information to build your CV: ");
        System.out.println("Your name: ");
        String name = myInput.nextLine();

        System.out.println("Your age: ");
        int age = myInput.nextInt();

        System.out.println("Your gender: ");
        String gender = myInput.next();
        myInput.nextLine(); // avoiding to skip the next input education

        System.out.println("Your education: ");
        String education = myInput.nextLine();

        System.out.println("Your email: ");
        String email = myInput.next();
        myInput.nextLine();

        System.out.println("Your profession: ");
        String profession = myInput.nextLine();

        System.out.println("Your company: ");
        String company = myInput.nextLine();

        System.out.println(buildCV(name, age, gender, education, email, profession, company));
    }

    public static String buildCV(String name, int age, String gender, String education, String email, String profession, String company) {
        return "My name is " + name + ", I am " + age + " years old and " + gender +
                ".\nMy education is " + education + " and my e-mail address is " + email +
                ".\nI work as a " + profession + " at " + company + ".";
    }
}

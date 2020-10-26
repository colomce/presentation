package martin_fowler_ex.consoleapp;

import java.util.Scanner;

public class Askme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("Enter your Gender: ");
        String gender = scanner.nextLine();
        System.out.println("Your gender is " + gender);

        System.out.println("Doing some more operations....");
        System.out.println("Person saved in the database...");
    }
}

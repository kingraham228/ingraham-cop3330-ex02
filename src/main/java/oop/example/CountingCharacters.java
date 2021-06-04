package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kate Ingraham
 */
import java.util.Scanner;

public class CountingCharacters {

    public static String checkEntry(String stringCount) {

        if (stringCount.isBlank() || stringCount.isEmpty()) {
            System.out.println("Empty Entry. Please Try again.");
        } else {
            System.out.printf("%s%s%n%s%s%d%s", "What is the input string? ", stringCount, stringCount, " has ", stringCount.length(), " characters.");
        }
        return "";
    }

    public String getStringCount() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your string: ");
        return input.nextLine();
    }

}

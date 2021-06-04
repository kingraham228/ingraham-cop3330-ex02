package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kate Ingraham
 */
public class App
{
    public static void main( String[] args )
    {
        CountingCharacters a = new CountingCharacters();
        String inputString = a.getStringCount();
        String printCharacterCount = CountingCharacters.checkEntry(inputString);
        System.out.println(printCharacterCount);

    }
}

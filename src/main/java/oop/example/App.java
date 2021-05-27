package oop.example;

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

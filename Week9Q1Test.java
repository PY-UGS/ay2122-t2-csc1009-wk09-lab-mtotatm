package Week9;

import org.junit.jupiter.api.Test;

import static java.lang.Character.isLetterOrDigit;
import static org.junit.jupiter.api.Assertions.*;

class Week9Q1Test
{
    RandomCharacter r = new RandomCharacter();

    @Test
    void getRandomLowerCaseLetter()
    {
        char letter = r.getRandomLowerCaseLetter();
        assertTrue(isLetterOrDigit(r.getRandomLowerCaseLetter()));
        boolean bool1 = Character.isLetterOrDigit(letter);
        System.out.println(letter + " is a letter/digit ? " + bool1);
    }

    @Test
    void getRandomUpperCaseLetter()
    {
        char letter = r.getRandomUpperCaseLetter();
        assertTrue(isLetterOrDigit(r.getRandomUpperCaseLetter()));
        boolean bool1 = Character.isLetterOrDigit(letter);
        System.out.println(letter + " is a letter/digit ? " + bool1);
    }

    @Test
    void getRandomDigitCharacter()
    {
        int value = r.getRandomDigitCharacter();
        assertTrue(isNumeric(String.valueOf(value)));
    }

    @Test
    void getRandomCharacter()
    {
        char letter = r.getRandomCharacter();
        assertTrue(isLetterOrDigit(r.getRandomCharacter()));
        boolean bool1 = Character.isLetterOrDigit(letter);
        System.out.println(letter + " is a letter/digit ? " + bool1);
    }

    public boolean isPrime(int num)
    {
        if (num<=1)
            return false;
        for(int i=2;i<num;i++)
        {
            if (num%i==0)
                return false;
        }
        return true;
    }
    public static boolean isNumeric(String strNum)
    {
        if (strNum == null)
        {
            return false;
        }
        try
        {
            double d = Double.parseDouble(strNum);
        }
        catch (NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }
}
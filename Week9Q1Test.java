package Week9;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static java.lang.Character.isLetterOrDigit;
import static org.junit.jupiter.api.Assertions.*;

class Week9Q1Test
{
    RandomCharacter r = new RandomCharacter();

    @RepeatedTest(15)
    void getRandomLowerCaseLetter()
    {
        char t = r.getRandomLowerCaseLetter();
        System.out.println("Random lower case letter: " + t);
        assertTrue(isLetterOrDigit(t));
    }

    @RepeatedTest(15)
    void getRandomUpperCaseLetter()
    {
        char t = r.getRandomUpperCaseLetter();
        System.out.println("Random upper case letter: " + t);
        assertTrue(isLetterOrDigit(t));
    }

    @RepeatedTest(15)
    void getRandomDigitCharacter()
    {
        int value = r.getRandomDigitCharacter();
        System.out.println("Random digit character: " + value);
        assertTrue(isNumeric(String.valueOf(value)));
    }

    @RepeatedTest(15)
    void getRandomCharacter()
    {
        char t = r.getRandomCharacter();
        System.out.println("Random character: " + t);
        assertTrue(isLetterOrDigit(t));
    }

    public static boolean isNumeric(String strNum)
    {
        if (strNum == null)
        {
            System.out.println(strNum + " is not a number");
            return false;
        }
        try
        {
            double d = Double.parseDouble(strNum);
            System.out.println(strNum + " is a number");
        }
        catch (NumberFormatException nfe)
        {
            System.out.println(strNum + " is not a number");
            return false;
        }
        return true;
    }
}
package Week9;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static java.lang.Character.isLetterOrDigit;
import static org.junit.jupiter.api.Assertions.*;

class Week9Q2Test
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
        assertTrue(isPrime(value));
    }

    @RepeatedTest(15)
    void getRandomCharacter()
    {
        char t = r.getRandomCharacter();
        System.out.println("Random character: " + t);
        assertTrue(isLetterOrDigit(t));
    }

    public boolean isPrime(int num)
    {
        if (num==1)
        {
            System.out.println(num + " is a prime");
            return true;
        }
        else if (num <= 0)
        {
            System.out.println(num + " is not a prime");
            return false;
        }
        for(int i=2;i<num;i++)
        {
            if (num%i==0)
            {
                System.out.println(num + " is not a prime");
                return false;
            }
        }
        System.out.println(num + " is a prime");
        return true;
    }
}
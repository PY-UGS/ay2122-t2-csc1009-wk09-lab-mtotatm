package Week9;

public class Week9Q2
{
    public static void main(String[] args)
    {
        RandomCharacter r = new RandomCharacter();
        String randomCharacterString = "";
        String randomDigitCharacterString = "";
        String randomLowerCaseLetterString = "";
        String randomUpperCaseLetterString = "";
        int loop = 15;
        System.out.println("Unit testing begin");
        for(int i = 0;i <= loop;i++)
        {
            randomCharacterString+=r.getRandomCharacter();
            int tempInt = r.getRandomDigitCharacter();
            if(tempInt > 0)
            {
                for(int p = 2;p <= tempInt/2;p++)
                {
                    if (tempInt % p != 0)
                    {
                        System.out.println("Random Digit: " + tempInt + " is prime.");
                    }
                    else
                    {
                        System.out.println("Random Digit: " + tempInt + " is nonprime.");
                    }
                }
            }
            else
            {
                System.out.println("Random Digit: " + tempInt + " is nonprime.");
            }

            randomDigitCharacterString+=tempInt;
            randomLowerCaseLetterString+=r.getRandomLowerCaseLetter();
            randomUpperCaseLetterString+=r.getRandomUpperCaseLetter();
        }
        System.out.println("Unit testing finish\n");

        System.out.println("randomCharacterString: " + randomCharacterString);
        System.out.println("randomDigitCharacterString: " + randomDigitCharacterString);
        System.out.println("randomLowerCaseLetterString: " + randomLowerCaseLetterString);
        System.out.println("randomUpperCaseLetterString: " + randomUpperCaseLetterString);
    }
}
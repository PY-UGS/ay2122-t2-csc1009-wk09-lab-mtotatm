package Week9;

public class Week9Q1
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
            char tempChar = r.getRandomCharacter();
            randomCharacterString += tempChar;
            System.out.println("randomCharacterString: " + tempChar);

            int tempInt = r.getRandomDigitCharacter();
            randomDigitCharacterString += tempInt;
            System.out.println("randomDigitCharacterString: " + tempInt);

            char tempLowerChar =r.getRandomLowerCaseLetter();
            randomLowerCaseLetterString += tempLowerChar;
            System.out.println("randomLowerCaseLetterString: " + tempLowerChar);

            char tempUpperChar = r.getRandomUpperCaseLetter();
            randomUpperCaseLetterString += tempUpperChar;
            System.out.println("randomUpperCaseLetterString: " + tempUpperChar);
        }
        System.out.println("Unit testing finish\n");

        System.out.println("randomCharacterString: " + randomCharacterString);
        System.out.println("randomDigitCharacterString: " + randomDigitCharacterString);
        System.out.println("randomLowerCaseLetterString: " + randomLowerCaseLetterString);
        System.out.println("randomUpperCaseLetterString: " + randomUpperCaseLetterString);
    }
}

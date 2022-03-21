package Week9;

public class RandomCharacter
{
    public char getRandomLowerCaseLetter()
    {
        int firstLowercaseIndex = (int)'a';
        char c = (char)(Math.random()*26 + firstLowercaseIndex);
        return c;
    }

    public char getRandomUpperCaseLetter()
    {
        int firstUppercaseIndex = (int)'A';
        char c = (char)(Math.random()*26 + firstUppercaseIndex);
        return c;
    }

    public int getRandomDigitCharacter()
    {
        int min = 0;
        int max = 9;
        int random = (int)Math.floor(Math.random() * ((max-min+1)+min));
        return random;
    }

    public char getRandomCharacter()
    {
        int firstLowercaseIndex = (int)'a';
        int firstUppercaseIndex = (int)'A';
        char c;
        int min = 0;
        int max = 9;
        int random = (int)Math.floor(Math.random() * ((max-min+1)+min));

        if(random > 4)
        {
            c = (char)(Math.random()*26 + firstUppercaseIndex);
        }
        else
        {
            c = (char)(Math.random()*26 + firstLowercaseIndex);
        }

        return c;
    }
}

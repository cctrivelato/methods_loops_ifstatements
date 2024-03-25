import java.util.*;
/**
 * Response
 *
 * @author (Caique Trivelato)
 * @version (2/10/2024)
 */
public class Response
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String oneLineSentence, lastChar;
        int sentenceSize;
        
        System.out.println("Please write me a one line sentence and I will answer you.");
        oneLineSentence = keyboard.nextLine();
        
        sentenceSize = oneLineSentence.length();
        lastChar = oneLineSentence.substring(sentenceSize-1);
        
        if (lastChar.equals("?")){
            if (sentenceSize % 2 == 0)
                System.out.println("Yes!");
            else
                System.out.println("No");
            }
        else if (lastChar.equals("!"))
            System.out.println("Wow");
        else
            System.out.println("You always say \"" + oneLineSentence + "\"");
    }
}

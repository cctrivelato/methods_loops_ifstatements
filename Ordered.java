import java.util.*;
/**
 * Ordered
 * Reading three strings and displaying the second
 * @author (Caique Trivelato)
 * @version (2/10/2024)
 */
public class Ordered
{
    public static void main(String[] args)
    {
        System.out.println("Hello! This is a program that reads words arrenged lexicographically.");
        System.out.println("Write me three separated sentences that I will display only the second when arrenged lexicographically.");
        
        Scanner keyboard = new Scanner(System.in);
        String firstSentence, secondSentence, thirdSentence;
        int comparisonOne, comparisonTwo, comparisonThree;
        
        firstSentence = keyboard.nextLine();
        secondSentence = keyboard.nextLine();
        thirdSentence = keyboard.nextLine();
        
        comparisonOne = firstSentence.compareTo(secondSentence);
        comparisonTwo = firstSentence.compareTo(thirdSentence);
        comparisonThree = secondSentence.compareTo(thirdSentence);
        
        if ((comparisonOne < 0) && (comparisonTwo > 0)) //testing for the first sentence #1 out of 2
            System.out.println("The second sentence arrenged lexicographically is " +  firstSentence);

        else if ((comparisonOne > 0) && (comparisonTwo < 0))   //testing for the first sentence #2 out of 1
             System.out.println("The second sentence arrenged lexicographically is " +  firstSentence);
             
        else if ((comparisonOne > 0) && (comparisonThree > 0))  //testing for the second sentence #1 out of 2
            System.out.println("The second sentence arrenged lexicographically is " +  secondSentence);
            
        else if ((comparisonOne < 0) && (comparisonThree < 0))  //testing for the second sentence #2 out of 2
            System.out.println("The second sentence arrenged lexicographically is " +  secondSentence);
        
        else if ((comparisonTwo < 0) && (comparisonThree > 0))  //testing for the third sentence #1 out of 2
            System.out.println("The second sentence arrenged lexicographically is " +  thirdSentence);
            
        else if ((comparisonTwo > 0) && (comparisonThree < 0))  //testing for the third sentence #2 out of 2
            System.out.println("The second sentence arrenged lexicographically is " +  thirdSentence);
            
        else if ((comparisonOne == 0) || (comparisonTwo == 0) || (comparisonThree == 0))  //making it an error if there are two sentences that are the exact same
            System.out.println("Error. The sentence cannot be found because two of the three sentences are the exact same.");
            
        else
            System.out.println("Input not valid.");
    }
}
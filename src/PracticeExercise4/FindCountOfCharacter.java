package PracticeExercise4;

import java.util.Arrays;
import java.util.Collections;

public class FindCountOfCharacter
    {
        public int FindCountOfCharacterFunction(String character,String searchWord)
            {
                String REGEX = character;
                String INPUT = searchWord;
                String[] w=INPUT.split("");
                int count=Collections.frequency(Arrays.asList(w),REGEX);


                //Prints the number of capturing groups in this matcher's pattern.
//                System.out.println("Group Count: "+count+"\n");
                return count;
            }
    }

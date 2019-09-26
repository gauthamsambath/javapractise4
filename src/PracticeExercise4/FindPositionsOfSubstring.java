package PracticeExercise4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindPositionsOfSubstring
    {
        public void FindPositionsOfSubstringFunction(String regex,String sentence)
            {
                Pattern pattern
                        = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(sentence);
                while (matcher.find())
                {
                    System.out.printf("\n found at: "+matcher.start()+" - "+matcher.end()+"\n ");
                }
            }
    }

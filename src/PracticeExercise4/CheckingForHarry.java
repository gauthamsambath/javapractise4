package PracticeExercise4;

import java.util.regex.Pattern;

public class CheckingForHarry
    {
        public boolean CheckingForHarrFunction(String word)
            {
                String regex=".*[hH][aA][rR][rR][yY].*?";
                Boolean b= Pattern.compile(regex).matcher(word).matches();
                return b;
            }
    }

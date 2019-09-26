package PracticeExercise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortWordsInStringAlphabetic
    {
        public List<String> SortWordsInStringAlphabeticFunction(String word)
            {
                String[] wordArray=word.split(" ");
                List<String> wordList=new ArrayList<String>();
                wordList= Arrays.asList(wordArray);
                Collections.sort(wordList);
                return wordList;
            }
    }

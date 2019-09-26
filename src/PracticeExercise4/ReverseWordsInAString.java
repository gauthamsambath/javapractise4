package PracticeExercise4;

public class ReverseWordsInAString
    {
        public String ReverseWordsInAStringFunction(String word)
            {
                String[] wordArray=word.split(" ");
                int i=0;
                for (String w:wordArray)
                {
                    StringBuffer wordB=new StringBuffer(w);
                    wordB=wordB.reverse();
                    wordArray[i++]= String.valueOf(wordB);
                }
                String reversedSentence="";
                for (String w:wordArray)
                {
                    reversedSentence=reversedSentence+w+" ";
                }
                reversedSentence.trim();
                return reversedSentence;
            }
    }

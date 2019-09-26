package PracticeExercise4;

public class ReplaceCharacter
    {
        public String ReplaceCharacterFunction(String word)
        {
            word=word.toLowerCase();
            word=word.replaceAll("d","f");
            word=word.replaceAll("l","t");
            return word;
        }
    }

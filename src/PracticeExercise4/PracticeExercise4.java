package PracticeExercise4;

import java.util.List;
import java.util.Scanner;

public class PracticeExercise4
    {
        public static void main(String[] args)
            {
                char decision;
                Scanner scanner=new Scanner(System.in);
                int choice;
                do
                    {
                        System.out.printf("\n Choose an option \n");
                        System.out.printf("1. Find the number of a character in a given string \n");
                        System.out.printf("2. Replace 'd and D' with 'f' and 'l and L' with 't' in a string \n");
                        System.out.printf("3. Extract words from a string and display words in alphabetical order \n");
                        System.out.printf("4. Reverse an entire sentence in the same order of words in the original string \n");
                        System.out.printf("5. To find if a sentence has harry in it \n");
                        System.out.printf("6. Find all locations of the given substring \n");
                        choice=scanner.nextInt();
                        switch (choice)
                            {
                                case 1:
                                    System.out.printf("\n Enter the character to search for\n");
                                    String character=scanner.next();
                                    System.out.printf("\n Enter the String to search in \n");
                                    String searchWord=scanner.next();
                                    FindCountOfCharacter findCountOfCharacter=new FindCountOfCharacter();
                                    int count=findCountOfCharacter.FindCountOfCharacterFunction(character,searchWord);
                                    System.out.printf("\n Count of character "+character+" is = "+count);
                                    break;
                                case 2:
                                    System.out.printf("\n Enter the string \n");
                                    scanner.nextLine();
                                    String word=scanner.nextLine();
                                    ReplaceCharacter replaceCharacter=new ReplaceCharacter();
                                    word=replaceCharacter.ReplaceCharacterFunction(word);
                                    System.out.printf("\n converted String ="+word+"\n");
                                    break;
                                case 3:
                                    System.out.printf("\n Enter the string \n");
                                    scanner.nextLine();
                                    word=scanner.nextLine();
                                    SortWordsInStringAlphabetic sortWordsInStringAlphabetic=new SortWordsInStringAlphabetic();
                                    List<String> sortedWordList=sortWordsInStringAlphabetic.SortWordsInStringAlphabeticFunction(word);
                                    System.out.printf("\n Words in alphabetic order = "+sortedWordList.toString()+"\n");
                                    break;
                                case 4:
                                    System.out.printf("\n Enter the string \n");
                                    scanner.nextLine();
                                    word=scanner.nextLine();
                                    ReverseWordsInAString reverseWordsInAString=new ReverseWordsInAString();
                                    word=reverseWordsInAString.ReverseWordsInAStringFunction(word);
                                    System.out.printf("\n reversed String : "+word+"\n");
                                    break;
                                case 5:
                                    System.out.printf("\n Enter the string \n");
                                    scanner.nextLine();
                                    word=scanner.nextLine();
                                    CheckingForHarry checkingForHarry=new CheckingForHarry();
                                    Boolean b=checkingForHarry.CheckingForHarrFunction(word);
                                    System.out.printf("\n Is harry here ? "+b+"\n");
                                    break;
                                case 6:
                                    System.out.printf("\n Enter the substring to search for \n");
                                    String regex=scanner.next();
                                    System.out.printf("\n Enter the sentence you want to search in \n");
                                    scanner.nextLine();
                                    String sentence=scanner.nextLine();
                                    FindPositionsOfSubstring findPositionsOfSubstring=new FindPositionsOfSubstring();
                                    findPositionsOfSubstring.FindPositionsOfSubstringFunction(regex,sentence);
                                    break;
                                default:
                                    System.out.printf("\n Invalid Case \n");
                            }
                        System.out.printf("\n Press 'y' to continue or 'any key' to exit \n");
                        decision=scanner.next().charAt(0);
                    }while (decision=='y');
            }
    }

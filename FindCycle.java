/*
Given a list of words, determine whether the words can be chained to form a circle.
A word X can be placed in front of another word Y in a circle if the last character of X is same as the first character of Y.

For example, the words ['chair', 'height', 'racket', touch', 'tunic'] can form the following circle:
chair --> racket --> touch --> height --> tunic --> chair.
*/

import java.util.*;

public class FindCycle{

    public static boolean checkCycle(String[] words) {
        Map<Character, ArrayList<Character>> firstToLastLetter = new HashMap<Character, ArrayList<Character>>();
        for(String word : words){
            if(firstToLastLetter.containsKey(word.charAt(0))){
                firstToLastLetter.get(word.charAt(0)).add(word.charAt(word.length() - 1));
            }
            else{
                ArrayList<Character> lastLetters = new ArrayList<Character>();
                lastLetters.add(word.charAt(word.length() - 1));
                firstToLastLetter.put(word.charAt(0), lastLetters);
            }
        }
        for(String word : words){
            for(int i = 0; i < words.length; i++){
                
            }
        }

        return true;
    }
    public static void main(String[] args){
        String[] words = {"chair", "height", "racket", "touch", "tunic"};
        int n = 4;
        int powerOf = 7;
        System.out.println(checkCycle(words));
    }
}

/*
Given a string and a pattern, find the starting indices of all occurrences of the pattern in the string.
For example, given the string "abracadabra" and the pattern "abr", you should return [0, 7].
*/
import java.util.*;
class FindPattern {

    public static ArrayList<Integer> getPatternIndexes(String input, String pattern){
        ArrayList<Integer> startIndexes = new ArrayList<Integer>();
        int patternIndex = pattern.length() - 1;
        for(int i = input.length() - 1; i >= 0; i--){
            if(input.charAt(i) == pattern.charAt(patternIndex)){
                if(patternIndex == 0){
                    startIndexes.add(i); 
                    patternIndex = pattern.length() - 1; //reset pattern index
                }
                else{
                    patternIndex--;
                }
            }
            else{
                
                patternIndex = pattern.length() - 1; //reset pattern index
            }
        }
        return startIndexes;
    }
    public static void main(String[] args){

        String input = "abracadabra";
        String pattern = "abr";
        System.out.println(getPatternIndexes(input, pattern));
    }
}
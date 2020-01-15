/*
Given a string s and a non-empty string p, find all the start indices of p's anagrams in s. The order of output does not matter.

s: "cbaebabacd" p: "abc"

Output:
[0, 6]

The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
*/

import java.util.*;
class Anagrams {

    public static ArrayList<Integer> getAnagramIndexes(String input, String pattern){
        ArrayList<Integer> startIndexes = new ArrayList<Integer>();
        for(int i = input.length() - 1; i >= pattern.length() - 1; i--){
            String tmpPattern = pattern;
            String subInput = input.substring(i - (pattern.length() - 1), i + 1); //O(m) running time and space
            // System.out.println(subInput);
            for(int j = 0; j < subInput.length(); j++){
                // System.out.println("in");
                if(tmpPattern.contains(Character.toString(subInput.charAt(j)))){
                    System.out.println("in2");
                    tmpPattern.replaceFirst(Character.toString(subInput.charAt(j)), "");
                    System.out.println(tmpPattern);
                }
            }
            // System.out.println(tmpPattern);
            if(tmpPattern.length() == 0){
                startIndexes.add(i - (pattern.length() - 1));
            }
        }
        return startIndexes;
    }
    public static void main(String[] args){

        String input = "cbaebabacd";
        String pattern = "abc";
        System.out.println(getAnagramIndexes(input, pattern));
    }
}
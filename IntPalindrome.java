/*
Write a program that checks whether an integer is a palindrome. 
For example, 121 is a palindrome, as well as 888. 678 is not a palindrome.
Do not convert the integer into a string.
*/

public class IntPalindrome{
    
    public static boolean isPalindrome(int n){
        int reducedNum = n;
        int reversedNum = 0;
        while(reducedNum > 0){
            reversedNum = (reversedNum * 10) + (reducedNum % 10);
            reducedNum = reducedNum / 10;
        }
        if(reversedNum == n) return true;
        else return false;
    }
    public static void main (String[] args){
        int n = 121;
        System.out.println(isPalindrome(n));
    }
}
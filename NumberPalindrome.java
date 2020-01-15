/*Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true*/

class NumberPalindrome {
    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        else
        {
            String s = String.valueOf(x);
            int i = 0;
            int j = s.length() - 1;
            for(; i < j; i++){
                if(s.charAt(i) != s.charAt(j)){
                    return false;
                }
                j--;
            }
            return true;
        }
    }

    public static void main(String[] args){
        int x = 0;
        System.out.println(isPalindrome(x));
    }
}

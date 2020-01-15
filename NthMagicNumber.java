import java.util.*;

/*
Let's define a "sevenish" number to be one which is either a power of 7, or the sum of unique powers of 7.
The first few sevenish numbers are 1, 7, 8, 49, and so on.
Create an algorithm to find the nth sevenish number.
*/

public class NthMagicNumber{

    public static List<Integer> findNthNumber(int n, int powerOf) {
        List<Integer> sequence = new ArrayList<Integer>();
        for(int i = 0; i < n && sequence.size() < n; i++){
            int currPowerNum = (int) Math.pow(powerOf, i);
            sequence.add(currPowerNum);
            int breakIndex = i;
            for(int j = 0; j < breakIndex && sequence.size() < n; j++){
                sequence.add(sequence.get(j) + currPowerNum);
            }
        }
        return sequence;
    }
    public static void main(String[] args){

        int n = 4;
        int powerOf = 7;
        System.out.println(findNthNumber(n, powerOf));
    }
}
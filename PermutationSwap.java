import java.util.*;

public class PermutationSwap{
    //in place computations. O(n) running time, O(1) space
    public static String[] getPermuteArray(String[] input, int[] indexes){
        for(int i = 0; i < indexes.length; i++){
            if(indexes[i] >= 0){
                if(i != indexes[i]){
                    swap(input, i, indexes[i]);
                    indexes[indexes[i]] = -1;
                    indexes[i] = -1;
                }
            }
        }
        return input;
    }

    //swaps input[i] and input[j]
    public static void swap(String[] input, int i, int j){
        String temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    public static void main (String[] args){
        // String[] input = {"a", "b", "c", "d", "e"};
        String[] input = {"a", "b", "c"};
        // int[] indexes = {4,1,3,2,0};
        int[] indexes = {2,1,0};
        System.out.println(Arrays.toString(getPermuteArray(input, indexes)));
    }
}
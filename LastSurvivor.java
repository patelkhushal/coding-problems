import java.util.*;

class LastSurvivor {

    public static int getLastSurvivor(int[] input, int k){
        int removeCounter = input.length;
        int i = k - 1;
        while (removeCounter > 1){
            System.out.println("before: " + Arrays.toString(input));
            input[i] = 0;
            System.out.println("after: " + Arrays.toString(input));
            removeCounter--;
            if((i + k) >= input.length){
                i = input.length % k;
            }
            else{
                i = i + k;
            }
        }
        for(int j : input){
            if(input[j] != 0){
                return input[j];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 5, 6, 7};
        // List<Integer> input = new ArrayList<Integer>();
        // for (int i : prisoners) {
        //     input.add(i);
        // }

        int k = 3;
        System.out.println(getLastSurvivor(input, k));
    }
}

/*
 * 1,2,3,4,5
 * 1,3,4,5
 * 1,3,5 
 * 3,5 
 * 3
 */
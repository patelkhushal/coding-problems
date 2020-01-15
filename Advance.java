/*You are given an array of nonnegative integers. Let's say you start at the beginning of the array and are trying to advance to the end. You can advance at most, the number of steps that you're currently on. Determine whether you can get to the end of the array.

For example, given the array [1, 3, 1, 2, 0, 1], we can go from indices 0 -> 1 -> 3 -> 5, so return true.

Given the array [1, 2, 1, 0, 0], we can't reach the end, so return false.*/

public class Advance{
    //running time: O(n)
    public static boolean reachEnd(int[] input){
        int maxLeapIndex = input[0]; //keeps track of index we can advance to
        for(int i = 0; i < input.length; i++){
            if((maxLeapIndex) >= input.length){
                return true;
            }
            int maxNextStepsIndex = 0;
            int maxNextSteps = -1;
            for(int j = i + 1; j <= maxLeapIndex && j < input.length; j++){
                if(Math.max(maxNextSteps, input[j]) > maxNextSteps || maxNextSteps == input[j]){
                    maxNextSteps = input[j];
                    maxNextStepsIndex = j;
                }
            }
            if(maxNextSteps == 0 || maxNextSteps == -1){
                return false;
            }
            maxLeapIndex = maxNextSteps + maxNextStepsIndex;
            i = (maxNextStepsIndex - 1);
        }
        if(maxLeapIndex >= input.length){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        // int[] input = new int[] {1, 3, 1, 1, 0};
        int[] input = new int[] {0};
        System.out.println(reachEnd(input));
    }
}
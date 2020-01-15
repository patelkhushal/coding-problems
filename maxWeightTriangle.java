/*
You are given an array of arrays of integers, where each array corresponds to a row in a triangle of numbers. For example, [[1], [2, 3], [1, 5, 1]] represents the triangle:

  1
 2 3
1 5 1
We define a path in the triangle to start at the top and go down one row at a time to an adjacent value, eventually ending with an entry on the bottom row. For example, 1 -> 3 -> 5. The weight of the path is the sum of the entries.

Write a program that returns the weight of the maximum weight path.

*/

public class maxWeightTriangle{
    public static int getMaxWeight(int[][] input){
        int sum = 0;
        for (int i = 0; i < input.length; i++){
            sum = sum + getMax(input[i]);
        }
        return sum;
    }

    public static int getMax(int[] array){
        int max = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args){
        int[][] input = new int[][] {{1}, {2, 3}, {1, 5, 1}};
        System.out.println(getMaxWeight(input));
    }
}
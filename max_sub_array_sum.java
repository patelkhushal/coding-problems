/*
Given a circular array, compute its maximum subarray sum in O(n) time.

For example, given [8, -1, 3, 4], return 15 as we choose the numbers 3, 4, and 8 where the 8 is obtained from wrapping around.

Given [-4, 5, 1, 0], return 6 as we choose the numbers 5 and 1.
*/

//this solution does not work
public class max_sub_array_sum {
    //running time O(2n) since it'll iterate all the numbers at most twice
    public static int compute_max_sub_array_sum(int[] input){
        int glob_sum = 0;
        int running_sum = 0;
        int end = input.length;
        for(int i = 0; i != end; i++)
        {
            if(input[i] < 0 || i == (end - 1))
            {
                if(input[i] > 0)
                {
                    running_sum = running_sum + input[i];
                }
                if (running_sum > glob_sum)
                {
                    glob_sum = running_sum;
                    end = i;
                    running_sum = 0;
                }
            }
            else
            {
                running_sum = running_sum + input[i];
            }
            if (i == (input.length - 1)){ i = -1; }
        }
        return glob_sum;
    }
    public static void main(String[] args){
        int[] input = {1,-3,2,1,-1};
        System.out.println(compute_max_sub_array_sum(input));
    }
}

public class FindMinfromShifted{

    public static int recurse(int[] input, int start, int end){
        if(start == end){
            return input[start];
        }
        else if(end - start == 1){
            return Math.min(input[start], input[end]);
        }
        else{
            int diff = end - start;
            int midIndex = start + (int) Math.ceil(diff/2);
            int minIndex = getMin(input, start, end, midIndex);

            if(minIndex == start || minIndex == midIndex) return recurse(input, start, midIndex);
            else return recurse(input, midIndex, end);
        }
    }

    public static int findMin(int[] input){
        return recurse(input, 0, input.length - 1);
    }

    public static int getMin(int[] input, int i, int j, int k){
        int a = input[i]; int b = input[j]; int c = input[k];
        if(a < b && a < c) return i;
        else if(b < a && b < c) return j;
        else return k;
    }
    public static void main (String[] args){
        // int [] input = {18,19,20,21,1,2,3,4};
        // int [] input = {2};
        // int [] input = {4,5,1,2,3};
        int [] input = {26,32,77,89,101,112,113,121,1,2,3,8,10,12};
        System.out.println(findMin(input));
    }
}
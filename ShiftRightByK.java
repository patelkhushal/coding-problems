import java.util.Arrays;

class ShiftRightByK {
    public static int[] shiftRight(int k, int[] input) {
        int i = 0;
        int j = k;
        int stopIndex = input.length - (k - 1);
        // System.out.println(stopIndex);
        boolean resetCounter = false;
        for (; (i != stopIndex) || !(resetCounter); i++) {
            System.out.println(i);
            System.out.println(j);
            System.out.println(Arrays.toString(input));
            System.out.println("");
            if (i == stopIndex) {
                if(j >= i){
                    i = -1;
                }
                else{
                    i = (input.length - k) - 1;
                }
                resetCounter = true;
            } else {
                int tmp = input[i]; 
                input[i] = input[j];
                input[j] = tmp;
                j++;
                j = j % input.length;
            }
            
            
        }
        return input;
    }

    public static void main(String[] args) {
        int k = 3;
        // int[] input = new int[] {5,6,1,2,3,4};
        int[] input = new int[] { 11,21,33,4,125,8,9,5,3,2,77,66 };
        shiftRight(k, input);
        System.out.println(Arrays.toString(input));
    }
}
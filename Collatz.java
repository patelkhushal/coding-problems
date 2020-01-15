/*
A Collatz sequence in mathematics can be defined as follows. Starting with any positive integer:

if n is even, the next number in the sequence is n / 2
if n is odd, the next number in the sequence is 3n + 1
It is conjectured that every such sequence eventually reaches the number 1. Test this conjecture.

Bonus: What input n <= 1000000 gives the longest sequence?
*/

//code moified to do the bonus question. running time O(1000000 * n) = O(n), space = O(1)
public class Collatz{

    public static void computeCollatz(){
        int maxLen = 0;
        int n = 0;
        for(int i = 1; i <= 1000000; i++){
            int size = 0;
            long start = i;
            while(start != 1){
                // System.out.println(start);
                if (start % 2 == 0){ //if even
                    start = start/2;
                }
                else{ //if odd
                    start = (3 * start) + 1;
                }
                size++;
            }
            if(size > maxLen){
                maxLen = size;
                n = i;
            }
        }
        System.out.println(n);
    }
    public static void main (String[] args){
        computeCollatz();
    }
}
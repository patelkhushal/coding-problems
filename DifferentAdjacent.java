import java.util.*;

/*
Let's define a "sevenish" number to be one which is either a power of 7, or the sum of unique powers of 7.
The first few sevenish numbers are 1, 7, 8, 49, and so on.
Create an algorithm to find the nth sevenish number.
*/

public class DifferentAdjacent {

    public static List<HashSet<Integer>> findGroups(HashMap<Integer, int[]> input) {
        List<HashSet<Integer>> groups = new ArrayList<HashSet<Integer>>();
        HashSet<Integer> group = new HashSet<Integer>();
        for (int key : input.keySet()) {

        }
        return groups;
    }

    public static HashSet<Integer> getGroup(int key, HashMap<Integer, int[]> input) {
        HashSet<Integer> group = new HashSet<Integer>();
        group.add(key);
        int[] values = input.get(key);
        for (int value : values) {
            
        }
        return group;
    }

    public static void main(String[] args) {

        HashMap<Integer, int[]> input = new HashMap<Integer, int[]>();
        input.put(0, new int[] { 1, 2 });
        input.put(1, new int[] { 0, 5 });
        input.put(2, new int[] { 0 });
        input.put(3, new int[] { 6 });
        input.put(4, new int[] {});
        input.put(5, new int[] { 1 });
        input.put(6, new int[] { 3 });
        System.out.println(findGroups(input));
    }
}
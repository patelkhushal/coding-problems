/*
Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example 1:

Given nums = [3,2,2,3], val = 3,

Your function should return length = 2, with the first two elements of nums being 2.

It doesn't matter what you leave beyond the returned length.
Example 2:

Given nums = [0,1,2,2,3,0,4,2], val = 2,

Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.

Note that the order of those five elements can be arbitrary.

It doesn't matter what values are set beyond the returned length.
*/

import java.util.*;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        for (; i <= j;) {
            if (nums[i] == val && nums[j] != val) {
                swap(i, j, nums);
                i++;
                j--;
            } else if (nums[i] == val && nums[j] == val)
                j--;
            else
                i++;
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] == val)
                return i;
        }

        return i;
    }

    public static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        int len = removeElement(nums, val);
        System.out.println(len); System.out.println(Arrays.toString(nums));
    }
}

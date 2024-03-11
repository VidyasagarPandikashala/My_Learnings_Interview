package DSA.arrays;

import java.util.Arrays;

/**
 * Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

 

Example 1:

Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows: 
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3]
Example 2:

Input: nums = [5,0,1,2,3,4]
Output: [4,5,0,1,2,3]
Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
    = [4,5,0,1,2,3]
 
 */

// pseudocode
/**
 * create a result array
 * loop through the given array
 * check if the array value of the value of the 0 th index is within the index
 * range
 * assign the result to the index of the result array
 * if not assign the value in the index as it is
 * end the loop
 * return the result array
 */
public class BuildArrayPermutation {

    public static int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[nums[i]] < nums.length) {
                res[i] = nums[nums[i]];
            }

            else {
                res[i] = nums[i];
            }
        }

        return res;

    }

    public static void main(String[] args) {
        int[] nums = { 5, 0, 1, 2, 3, 4 };

        int[] res = buildArray(nums);
        System.out.println(Arrays.toString(res));

    }
}

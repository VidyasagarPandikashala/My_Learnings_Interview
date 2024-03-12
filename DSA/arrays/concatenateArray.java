package DSA.arrays;

import java.util.Arrays;

/**
 * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.

 

Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
Example 2:

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]
 */

//Pseudocode
/**
 * create the result array with twice the length of given array
 * Concatenation includes merging the given array twice
 * need outer loop to track the no of times the array is looped
 * if the outer loop is running first time set the storing index of the result
 * array from 0
 * otherwise from given array. length
 * start the inner loop to loop through the given array
 * save the current value of the nums at current index to result arry pf the
 * storing index
 * increase the storing index by 1
 * end of inner loop
 * end of outer loop (when twice)
 * 
 * return the result array
 */
public class concatenateArray {
    public static int[] getConcatenation(int[] nums) {

        int[] result = new int[nums.length * 2];

        for (int i = 1; i <= 2; i++) {
            int storingIndex;
            if (i == 1) {
                storingIndex = 0;
            } else {
                storingIndex = nums.length;
            }

            for (int j = 0; j < nums.length; j++) {
                result[storingIndex] = nums[j];
                storingIndex++;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };

        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}

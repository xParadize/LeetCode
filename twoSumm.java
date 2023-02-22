/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/


package LeetCode;

public class twoSumm {
    public int[] twoSum(int[] nums, int target) {
        int[] indxList = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    indxList[0] = i;
                    indxList[1] = j;
                    break;
                }
            }
        }
        return indxList;
    }
}

package ARRAYS.ARRAYS_easy;

import java.util.*;
/*
======================================
PROBLEM :) 561s
======================================
Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.

1 <= n <= 104
nums.length == 2 * n
-104 <= nums[i] <= 104
*/

/*
======================================
APPROACH:)
======================================
sort the array and add alternate elements starting from zero

Time : O(n logn)
Space : O(1)
*/

public class x16_array_partition_I {

  public static int arrayPairSum(int[] nums) {
    int sum = 0;
    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 1; i += 2) {
      sum += nums[i];
    }

    return sum;
  }

  public static void main(String[] args) {
    int[] nums = new int[] { 6, 2, 6, 5, 1, 2 };

    System.out.println(arrayPairSum(nums));
  }

}
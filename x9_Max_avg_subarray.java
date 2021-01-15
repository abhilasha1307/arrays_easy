package ARRAYS.ARRAYS_easy;

import java.util.Scanner;
/*
=================================================
PROBLEM:) #643 (EASY) Maximum Average Subarray I
=================================================
Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. And you need to output the maximum average value.

Input: [1,12,-5,-6,50,3], k = 4
Output: 12.75 
Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
*/

/*
======================
APPROACH:)
======================
here we add the first k elements and then compare that sum with the new sum which is the (prev sum + element at arr[i] (i starting from k)
+ element at arr[i-k])

we compare which one is greater and the greatest/k is returned

time : O(n)
Space : O(1)
*/

/*
==============================
ALTERNATE SOLUTION:)
================================
you can also make a sum array of sum of elements of nums and then perform similar process on the sum to get the result
Space : O(n)
*/

public class x9_Max_avg_subarray {
 public static double findMaxAverage(int[] nums, int k) {
  double sum = 0;
  for (int i = 0; i < k; i++) {
   sum += nums[i];
  }
  double res = sum;

  for (int i = k; i < nums.length; i++) {
   sum = sum + nums[i] - nums[i - k];
   res = Math.max(res, sum);
  }
  return res / k;
 }

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int m = in.nextInt();
  int[] nums = new int[m];
  for (int i = 0; i < m; i++) {
   nums[i] = in.nextInt();
  }
  int k = in.nextInt();
  double sol = findMaxAverage(nums, k);
  System.out.print("number of cosecutive ones " + sol);
  in.close();
 }
}

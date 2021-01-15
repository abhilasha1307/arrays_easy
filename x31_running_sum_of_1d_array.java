package ARRAYS.ARRAYS_easy;

/*
================================
PROBLEM :) 1480
=================================
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6
*/

/*
======================================
APPROACH:)
=======================================
we make a new array 'res' to be store the running sum 
make the first element (res[0]) to be the first element in the input array
then we loop on the input array starting from i=1 and at every 'i' we store (res[i-1] + nums[i]) and that would be the running sum till the current 'i'

Time : O(n). one pass over an array of size 'n'
Space : O(n). additional array 'res' of size 'n' is made
*/

//alternatively can also be done with sliding window approach

public class x31_running_sum_of_1d_array {
 public static int[] runningSum(int[] nums) {

  int[] res = new int[nums.length];
  res[0] = nums[0];
  for (int i = 1; i < nums.length; i++) { // standard prefix sum array approach

   res[i] = nums[i] + res[i - 1];
  }

  return res;
 }

 public static void main(String[] args) {

  int[] arr = new int[] { 3, 1, 2, 10, 1 };
  int[] res = runningSum(arr);

  for (int x : res) {
   System.out.print(x + " ");
  }
 }
}

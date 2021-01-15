package ARRAYS.ARRAYS_easy;

//done
import java.util.Scanner;

/*
=============
PROBLEM:)
=============
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*/

/*
==============
ANSWER:)
==============
used brute force (nested for loops)
here the array is unsorted and the elements needed can be anywhere in the whole array and not just side by side
as each array can only have one solution, we have to start inner loop from i + 1 for targets which can be obtained form sum of same numbers(eg: 3+3=6)

if there are no elements that add up to target; we return array with only one element (-1)
COMPLEXITY: time : O(N^2); Space : O(1)

==================
BETTER APPROACH: 
==================
use two pass or one pass hash table as for both of them time complexity is O(N) and space complexity is O(1) 
*/
public class x1_two_sum {

 public static int[] twoSum(int[] nums, int target) {
  for (int i = 0; i < nums.length; i++) {

   for (int j = i + 1; j < nums.length; j++) {
    if (nums[j] == target - nums[i]) {
     int[] x = new int[] { i, j };
     return x;
    }
   }
  }
  int[] y = new int[] { -1 };
  return y;
 }

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int len = in.nextInt();
  int[] arr = new int[len];
  for (int i = 0; i < len; i++) {
   arr[i] = in.nextInt();
  }
  int target = in.nextInt();
  int[] sol = twoSum(arr, target);
  for (int j : sol) {
   System.out.println(j);
  }
  in.close();
 }
}

package ARRAYS_easy;

import java.util.Scanner;

/*
=======================================
PROBLEM:)  #35 search insert position
========================================
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

Input: nums = [1,3,5,6], target = 5
Output: 2

Input: nums = [1,3,5,6], target = 2
Output: 1
 */

/*
===========
ANSWER:)
===========
here we check with each element if its greater than or equal to the target
if its equal means that target is already present in the array and we return its index

if nums[i] > target means that the target will be inserted in the place of current element
elements after that will be moved ahead by one index (if at all)

if the target has to be inserted in the end we return the length of array (int j = nums.length;
  return j;)

time : O(n)
Space : O(1)
*/
public class x4_search_insert_position {

  public static int searchInsert(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] >= target) {
        return i;
      }
    }
    int j = nums.length;
    return j;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int len = in.nextInt();
    int[] arr = new int[len];
    for (int i = 0; i < len; i++) {
      arr[i] = in.nextInt();
    }
    int target = in.nextInt();
    int sol = searchInsert(arr, target);
    System.out.println("index is/will be  " + sol);
    in.close();
  }
}
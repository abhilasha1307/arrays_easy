package ARRAYS.ARRAYS_easy;

import java.util.Scanner;
/*
=================================
PROBLEM:) #27 remove element
==================================
Given an array nums and a value val, remove all instances of that value in-place and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Clarification:
Confused why the returned value is an integer but your answer is an array?
Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller as well.

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3]
 */

/*
===========================
APPROACH:)
=============================
we set i and j at index 0
we traverse through the array checking if the current element is the value to be removed
if not, we assign arr[j++] to arr[i] (j++ to increment after the assignment operation)
if yes we shift i forward till the current element is the value not to be removed

we overwrite the value to be removed with the current value(which is the value we want to keep)
return j(will be equal new length now bcoz of post increment operation)

time: O(n)
space: O(1)
*/
public class x3_remove_element {
 public static int removeElement(int[] arr, int val) {
  int j = 0;
  for (int i = 0; i < arr.length; i++) {
   if (arr[i] != val) {
    arr[j++] = arr[i];
   }
  }
  return j;

 }

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int len = in.nextInt();
  int[] arr = new int[len];
  for (int i = 0; i < len; i++) {
   arr[i] = in.nextInt();
  }
  int val = in.nextInt();
  int sol = removeElement(arr, val);
  System.out.println(sol);
  for (int k = 0; k < sol; k++) {
   System.out.print(arr[k] + " ");
  }
  System.out.println();
  in.close();
 }
}
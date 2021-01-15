package ARRAYS.ARRAYS_easy;

//done
import java.util.Scanner;

/*
=========================================================
PROBLEM:) #26  Remove Duplicates from Sorted Array
==========================================================
Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4]
*/

/*
=============
APPROACH:) 
=============
we take 2 variables i and j starting from 0 and 1(till < n) 
if the value at current and prev indices are same we just shift j forward and i remains where it is

if the values are not the same we increment i and then copy the element at j to where i is (nums[i] = nums[j])

we return i+1 becoz length will we 1+ the greatest index of the array


time complexity: O(n), where n is the no. of elements of array
space complexity : O(1);
*/
public class x2_remove_duplicates_sortedarray {
 public static int removeDuplicates(int[] nums) {

  if (nums.length == 0)
   return 0;
  int i = 0; // comparing adjacent elements
  for (int j = 1; j < nums.length; j++) {
   if (nums[j] != nums[i]) {
    i++;
    nums[i] = nums[j];
   }
  }
  return i + 1;
 }

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int len = in.nextInt();
  int[] arr = new int[len];
  for (int i = 0; i < len; i++) {
   arr[i] = in.nextInt();
  }
  int sol = removeDuplicates(arr);
  System.out.println(sol);
  for (int k = 0; k < sol; k++) {
   System.out.println(arr[k] + " ");
  }
  in.close();
 }
}

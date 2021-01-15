package ARRAYS.ARRAYS_easy;

// 0ms solution ?
import java.util.Arrays;

/*
====================================
PROBLEM:) 1502
====================================
Given an array of numbers arr. A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.

Return true if the array can be rearranged to form an arithmetic progression, otherwise, return false.

2 <= arr.length <= 1000
-10^6 <= arr[i] <= 10^6
*/

/*
=========================================
APPROACH:)
==========================================
if the given array is infact a AP, it would be a lot easier to check for the common difference in between all the consecutive elements in the array, if we sort it
after sorting, we do one pass loop and check if any two elements have a different CD than the rest
if we find even 2 such elements, we return false
if we loop over the entire array without returning false, then its a AP

Time : O(n*logn); Tim Sort (worst between O(nlogn) & O(n))
Space : O(1)
*/

public class x29_can_make_AP_from_sequence {
 public static boolean canMakeArithmeticProgression(int[] arr) {

  Arrays.sort(arr);
  for (int i = 1; i < arr.length - 1; i++) {
   if ((arr[i] - arr[i - 1] != arr[i + 1] - arr[i])) {
    return false;
   }
  }
  return true;
 }

 public static void main(String[] args) {
  int[] arr = new int[] { 4, 2, 1 };
  System.out.println(canMakeArithmeticProgression(arr));
 }
}

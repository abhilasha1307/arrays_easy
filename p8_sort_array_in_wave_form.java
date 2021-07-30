package ARRAYS_easy;

/*
=========================================
PROBLEM:)
=========================================
Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array and return it. In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5..... (considering the increasing lexicographical order).
Basically numbers at odd positions are greater than the numbers at immediate even positions

========================================
EXAMPLE:)
N = 5
arr[] = {1,2,3,4,5}
Output: 2 1 4 3 5
=========================================
*/

/* 
====================================================
APPROACH:)
=====================================================
as the input array should be sorted, we just have to swap the elements pairwise (i and i+1 and increment the counter by 2 [i = i+2])

time : O(n)
space: O(1)
*/

public class p8_sort_array_in_wave_form {

 public static void main(String[] args) {
  int[] arr = new int[] { 1, 2, 3, 4, 5 };
  int n = arr.length;
  convertToWave(arr, n);

  for (int x : arr) {
   System.out.print(x + " ");
  }

 }

 public static void convertToWave(int arr[], int n) {
  for (int i = 0; i < n - 1; i += 2) {
   int temp = arr[i];
   arr[i] = arr[i + 1];
   arr[i + 1] = temp;
  }
 }
}

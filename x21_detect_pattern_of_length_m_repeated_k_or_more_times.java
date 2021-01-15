package ARRAYS.ARRAYS_easy;

/*
==============================================
PROBLEM:) 1566
==============================================
Given an array of positive integers arr,  find a pattern of length m that is repeated k or more times.
A pattern is a subarray (consecutive sub-sequence) that consists of one or more values, repeated multiple times consecutively without overlapping. A pattern is defined by its length and the number of repetitions.
Return true if there exists a pattern of length m that is repeated k or more times, otherwise return false.

2 <= arr.length <= 100
1 <= arr[i] <= 100
1 <= m <= 100
2 <= k <= 100
*/

/*
=====================================
APPROACH:)
=====================================
we make a variable count to count occurance of similar elements 'm' length apart
as we are comparing i and i+m; loop goes till arr.length -m (else AIOOBE)
if arr[i] = arr[i+m] we increment count by one (before comparing it to m*(k-1)) 
we take m*(k-1) because we have to count the elements repeated at m length, but we are only counting k-1 time, as we are at i and we are comparing it with i+m index
it is given to be a consecutive sub-sequence

Time : O(n-m) => O(linear)
Space : O(1)
*/
public class x21_detect_pattern_of_length_m_repeated_k_or_more_times {
 public static boolean containsPattern(int[] arr, int m, int k) {
  int count = 0;
  for (int i = 0; i < arr.length - m; i++) {
   if (arr[i] != arr[i + m]) {
    count = 0;
   }

   else if (++count == m * (k - 1)) {
    return true;
   }
  }
  return false;
 }

 public static void main(String[] args) {
  int[] arr = new int[] { 1, 2, 4, 4, 4, 4 };
  int m = 1;
  int k = 4;

  System.out.println(containsPattern(arr, m, k));
 }
}

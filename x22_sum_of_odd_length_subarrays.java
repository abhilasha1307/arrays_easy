package ARRAYS.ARRAYS_easy;
//sliding window

//regrouping

/*
======================================
PROBLEM:)  1588
======================================
Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.
A subarray is a contiguous subsequence of the array.
Return the sum of all odd-length subarrays of arr.

1 <= arr.length <= 100
1 <= arr[i] <= 1000
*/

/*
=======================================
APPROACH:)
=======================================
we make a variable 'sum' which will store the final answer and temp which will store the subarray sums for given i and j
starting from i = 0 to length and j is i till length
for every index j we store the subarray sum in temp, but only when j-i+1 is a odd length, we add this sum to the sum variable
after traversing the whole array we return sum

Time : O(n^2) (two nested loops)
Spaec
*/

public class x22_sum_of_odd_length_subarrays {

 public static int sumOddLengthSubarrays(int[] arr) {

  int sum = 0;

  for (int i = 0; i < arr.length; i++) {
   int temp = 0;

   for (int j = i; j < arr.length; j++) {
    temp += arr[j];

    if ((j - i + 1) % 2 == 1) { // odd length
     sum += temp;
    }
   }
  }

  return sum;
 }

 public static void main(String[] args) {
  int[] arr = new int[] { 1, 4, 2, 5, 3 };
  System.out.println(sumOddLengthSubarrays(arr));
 }

}

// Sliding window approach

/*
 * public static int sumOddLengthSubarrays(int[] arr) { int sum = 0; for (int i
 * = 1; i <= arr.length; i += 2) { sum += slidingSum(arr, i); } return sum; }
 * 
 * static int slidingSum(int[] arr, int windowSize) { int res = 0; int sum = 0;
 * for (int i = 0; i < arr.length; i++) { if (i < windowSize) { sum += arr[i]; }
 * else { res += sum; sum -= arr[i - windowSize]; sum += arr[i]; } } res += sum;
 * // sum of last few numbers in the array wont get added to res in the loop so
 * we // do it outside the loop(explain more) return res; }
 */
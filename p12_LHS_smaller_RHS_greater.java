package ARRAYS_easy;

/*
================
PROBLEM:)
================
Given an unsorted array of size N. Find the first element in array such that all of its left elements are smaller and all right elements to it are greater than it.
Note: Left and right side elements can be equal to required element. And extreme elements cannot be required element.

4 2 5 7 => 5
11 9 12 => -1
4 3 2 7 8 9 => 7
*/

/*
================
APPROACH:) 
================
we make two arrays of same size as the input array to store the maximum element from the left and minimum from the right of an element at index i 
leftMax[0] = Integer.MIN_VALUE;
rightMin[n - 1] = Integer.MAX_VALUE;

we compare leftMax[i-1] and arr[i-1] to store the max value in leftMax[i] (i starts from 1)
we compare rightMin[i+1] and arr[i+1] to store the min value in rightMin[i] (i starts from n-2)

then from i = 0 to n-1 we compare values to satify the condition of the question and return the first index(from left) whose element satisfies this
else return -1
 
time : O(n)
Space : O(n)
*/
public class p12_LHS_smaller_RHS_greater {

 public static void main(String[] args) {
  int[] arr = new int[] { 4, 3, 2, 7, 8, 9 };
  int n = arr.length;

  System.out.println(findElement(arr, n));
 }

 static int findElement(int[] arr, int n) {
  // leftMax[i] stores maximum of arr[0..i-1]
  int[] leftMax = new int[n];
  int[] rightMin = new int[n];
  leftMax[0] = Integer.MIN_VALUE;
  rightMin[n - 1] = Integer.MAX_VALUE;
  // Fill leftMax[]1..n-1]
  for (int i = 1; i < n; i++)
   leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);

  for (int i = n - 2; i >= 0; i--) {
   rightMin[i] = Math.min(rightMin[i + 1], arr[i + 1]);
  }

  for (int i = 0; i < n; i++) {
   if (leftMax[i] <= arr[i] && rightMin[i] >= arr[i]) {
    return i;
   }
  }
  // If there was no element matching criteria
  return -1;

 }

}

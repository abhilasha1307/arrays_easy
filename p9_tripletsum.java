package ARRAYS_easy;

import java.util.*;
/*
==========================================
PROBLEM:)
==========================================
Given an array A[] of N numbers and another number x, determine whether or not there exist three elements in A[] whose sum is exactly x.

Constraints:
1 ≤ N ≤ 10^3
1 ≤ A[i] ≤ 10^5

=====================================
EXAMPLES:
Input: N = 6, K = 13
arr[] = [1 4 45 6 10 8]

Output: true
======================================
*/

/*
=========================================
APPROACH:)
=========================================
we sort the array first
we make two variables 'a' & 'b' which are at i+1 and arr.length-1 initially
starting with i at 0; we check if arr[i]+arr[a]+arr[b] = sum 
if yes we return 1;
else if its >sum then be decrement 'b' to decrease the value of their sum and bring it closer or equal to the sum we want
else if its <sum then we increment 'a' to increase the value of their sum and bring it closer or equal to the sum we want

if there are no three values that add up to sum, we return 0

time: O(n^2)
space O(1)
*/
public class p9_tripletsum {

  public static void main(String[] args) {

    int[] arr = new int[] { 1, 4, 45, 6, 10, 8 };
    int n = arr.length;
    int x = 13;
    int res = tripletsum(arr, x, n);

    if (res == 1) {
      System.out.println("true");
    }

    else
      System.out.println("false");
  }

  public static int tripletsum(int[] arr, int x, int n) {
    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++) {
      int a = i + 1;
      int b = arr.length - 1;
      while (a < b) {
        if (arr[i] + arr[a] + arr[b] == x) {
          return 1;
        }

        else if (arr[i] + arr[a] + arr[b] < x) {
          a++;
        }

        else {
          b--;
        }

      }
    }
    return 0;
  }
}
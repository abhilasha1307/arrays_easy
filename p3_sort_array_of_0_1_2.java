package ARRAYS_easy;

/*
================
PROBLEM:) 
=================
Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.

=========================================
EXAMPLE:
N = 5
arr[]= {0 2 1 2 0}
Output: 0 0 1 2 2
==========================================
*/

/*
============
APPROACH:)
===========
we count the number of zeros, 1s and 2s in the array
set i to zero and first insert zeros till 'c0' is greater than zero
same with c1 and c2

time: O(N)
space: O(1)
*/

public class p3_sort_array_of_0_1_2 {

  public static void main(String[] args) {
    int[] arr = new int[] { 0, 2, 1, 2, 0 };
    int n = arr.length;
    zeroandONE_TWO(arr, n);
    for (int x : arr) {
      System.out.print(x + " ");
    }
  }

  public static void zeroandONE_TWO(int[] a, int n) {
    int c0 = 0, c1 = 0, c2 = 0;
    int i = 0;

    for (int x : a) {
      if (x == 0) {
        c0++;
      }

      else if (x == 1)
        c1++;
      else
        c2++;
    }

    while (c0 > 0) {
      a[i] = 0;
      c0--;
      i++;
    }

    while (c1 > 0) {
      a[i] = 1;
      c1--;
      i++;
    }

    while (c2 > 0) {
      a[i] = 2;
      c2--;
      i++;
    }
  }

}

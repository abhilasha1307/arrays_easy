package ARRAYS_easy;

/*
=====================
PROBLEM:)  
=====================
Given an array arr[] of N positive integers. Push all the zero’s of the given array to the right end of the array while maitaining the order of non-zero elements.

EXAMPLE:
N = 5
Arr[] = {3, 5, 0, 0, 4}
Output: 3 5 4 0 0
*/

/*
============================================
APPROACH:) 
============================================
using counter(int count) to count the number of non zeros and then swapping them with non zero numbers till we reach the end of the array such that all zeros get shifted to the right end.
time complexity : O(n);
space complexity : O(constant);
*/
public class p5_move_0s_toend {

  public static void main(String[] args) {
    int[] arr = new int[] { 1, 0, 0, 8, 2, 6, 0, 0, 7, 8 };
    int n = arr.length;

    pushZerosToEnd(arr, n);
    for (int x : arr) {
      System.out.print(x + " ");
    }

    Prac.pushZerosToEnd(arr, n);
    for (int x : arr) {
      System.out.print(x + " ");
    }
  }

  static void pushZerosToEnd(int[] arr, int n) {
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] != 0) {
        int t = arr[i];
        arr[i] = arr[count];
        arr[count] = t;
        count++;
      }
    }
  }
}

class Prac {
  static void pushZerosToEnd(int[] arr, int n) {
    int i = 0, j = 0;
    for (; i < n && j < n;) {
      if (arr[i] == 0) {
        i++;
        continue;
      } else if (arr[i] != 0 && i != j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
      }

      i++;
      j++;
    }
  }
}
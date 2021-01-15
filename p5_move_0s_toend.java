package ARRAYS.ARRAYS_easy;

/*
=====================
PROBLEM:)  
=====================
Given an array arr[] of N positive integers. Push all the zero’s of the given array to the right end of the array while maitaining the order of non-zero elements.
 */

/*
=================
APPROACH:) 
====================
using counter(int count) approach to count the number of non zeros and then swapping them with non zero numbers till we reach the  end of the array such that all zeros get shifted to the right end. Here we have done it in single tarversal
time complexity : O(n);
space complexity : O(constant);
==================================
ALTERNATIVE APPROACH:)
==================================
traversing the array twice

we can also do it by traversing the array twice; complexity will still be O(n)
for (int i =0; i<n; i++)  //array traversed twice
  { if (arr[i] != 0) 
   { arr[count] = arr[i]; count++; }
  }
  while (count < n) { arr[count++] = 0; }
*/
public class p5_move_0s_toend {

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
    for (int j = 0; j < n; j++) {
      System.out.print(arr[j] + " ");
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 1, 0, 0, 8, 2, 6, 0, 0, 7, 8 };
    int n = arr.length;
    pushZerosToEnd(arr, n);

  }
}

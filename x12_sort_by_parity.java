package ARRAYS_easy;

//done with two pass
import java.util.Scanner;

/*
==============
PROBLEM:
==============
Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
You may return any answer array that satisfies this condition.

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
*/

/*
=================
APPROACH:
==================
here we make a new array arr of size same as the input array
we start from i = 0, and t = 0 (for arr)
using two for loops, we first copy even numbers(in first loop) and then all the odd numbers (in the second loop)
return arr

time : O(n)
Space : O(n)
*/

public class x12_sort_by_parity {

 public static int[] sortArrayByParity(int[] A) {
  int[] arr = new int[A.length];

  int t = 0;
  for (int i = 0; i < A.length; i++) {
   if (A[i] % 2 == 0) {
    arr[t++] = A[i];
   }
  }

  for (int i = 0; i < A.length; i++) {
   if (A[i] % 2 != 0) {
    arr[t++] = A[i];
   }
  }

  return arr;
 }

 public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  int l = s.nextInt();
  int[] A = new int[l];

  for (int i = 0; i < l; i++) {
   A[i] = s.nextInt();
  }

  int[] sol = sortArrayByParity(A);

  for (int i = 0; i < l; i++) {
   System.out.print(sol[i] + " ");
  }
  System.out.println();
  s.close();
 }
}

package ARRAYS.ARRAYS_easy;

import java.util.Scanner;
/*
========================================
PROBLEM:) #509 (EASY) Fibonacci Number
========================================
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), for N > 1.
Given N, calculate F(N).

Input: 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
*/

/*
========================
APPROACH:)
========================
we make and array of size N+1 were N is the N is the element for which we want the value F(N)
root values in fibonacci series are 0 and 1
so we initialize a[0] =  0 & a[1] = 1
we start from i=2 (already kept values for 0 and 1)

current value is the sum of prev 2 values
we traverse array till N (as we want F(N))

and return a[N] (will be same as F(N))

time: O(N)
space: O(N) [array of N+1 size is made]

*/
public class x7_Fibonacci_number {
 public static int fib(int N) {
  int[] a = new int[N + 1];
  if (N == 0)
   return 0;
  else if (N == 1)
   return 1;
  else {
   a[0] = 0;
   a[1] = 1;
   int i = 0;
   for (i = 2; i < a.length; i++) {
    {
     a[i] = a[i - 1] + a[i - 2];
    }

   }
   return a[N]; // or return a[N] (size is N+1 so N is a valid index)
  }
 }

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int m = in.nextInt();
  int sol = fib(m);
  System.out.println(sol);
  in.close();
 }
}

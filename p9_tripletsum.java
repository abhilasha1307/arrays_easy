package ARRAYS.ARRAYS_easy;

import java.io.IOException;
import java.util.*;
/*
===========
PROBLEM:)
===========
Given an array A[] of N numbers and another number x, determine whether or not there exist three elements in A[] whose sum is exactly x.

6 13
1 4 45 6 10 8
1
*/

/*
===========
APPROACH:)
===========
we sort the array first
we make two variables 'a' & 'b' which are at 1 and arr.length-1 initially
starting with i at 0; we check if arr[i]+arr[a]+arr[b] = sum 
if yes we return 1;
else if its >sum then be decrement 'b' to decrease the value of their sum and bring it closer or equal to the sum we want
else if its <sum then we increment 'a' to increase the value of their sum and bring it closer or equal to the sum we want

if there are no three values that add up to sum, we return 0

time: O(n^2)
space O(1)
*/
public class p9_tripletsum {

 public static int tripletsum(int[] arr, int x) {
  Arrays.sort(arr); // timsort => O(nlogn); uses insertion and merge sort
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

 public static void main(String[] args) throws IOException {

  Scanner s = new Scanner(System.in);
  int t = s.nextInt();
  while (t > 0) {
   int n = s.nextInt();
   int x = s.nextInt();
   int[] arr = new int[n];
   for (int i = 0; i < n; i++) {
    arr[i] = s.nextInt();
   }

   int sol = tripletsum(arr, x);
   System.out.println(sol);
   t--;
  }
  s.close();
 }

}
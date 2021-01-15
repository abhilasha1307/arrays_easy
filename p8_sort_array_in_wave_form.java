package ARRAYS.ARRAYS_easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;

/*
===============
PROBLEM:)
===============
Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array and return it. In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5..... (considering the increasing lexicographical order).

N = 5
arr[] = {1,2,3,4,5}
Output: 2 1 4 3 5
*/
/* 
=============
APPROACH:)
=============
as the input array should be sorted, we just have to swap the elements pairwise
all elements are swapped if even number of elements are present
all except last element are swapped if number of elements are odd

here position is not same as index; positions start from one and index from zero (even positon element must be smaller than odd positioned elements)
If current element is smaller than previous odd element, swap previous and current.
If current element is smaller than next odd element, swap next and current.

time : O(n)
space: O(1)
*/

public class p8_sort_array_in_wave_form {

 public static void convertToWave(int arr[], int n) {

  for (int i = 0; i < n - 1; i++) {
   int temp = arr[i];
   arr[i] = arr[i + 1];
   arr[i + 1] = temp;

   i++;
  }

 }

 public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int t = Integer.parseInt(br.readLine().trim());
  while (t > 0) {
   int n = Integer.parseInt(br.readLine().trim());
   int[] arr = new int[n];
   String inpuLine[] = br.readLine().trim().split(" ");
   for (int i = 0; i < n; i++) {
    arr[i] = Integer.parseInt(inpuLine[i]);
   }

   convertToWave(arr, n);

   StringBuffer s = new StringBuffer();
   for (int i = 0; i < n; i++) {
    s.append(arr[i] + " ");
   }

   System.out.println(s);
   t--;
  }
 }
}

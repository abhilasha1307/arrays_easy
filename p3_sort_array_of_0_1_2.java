package ARRAYS.ARRAYS_easy;

//done
import java.io.BufferedReader;
import java.io.*;

/*
================
PROBLEM:) #16; LEVEL:easy; topic: sorting(array DS)
=================
Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.
*/

/*
============
APPROACH:)
===========
we count the number of zeros, 1s and 2s in the array
set i to zero again and first insert zeros till 'c0' is greater than zero
same with 1s and 2s

time: O(n)
space: O(1)

 */

public class p3_sort_array_of_0_1_2 {

 public static void zeroandONE_TWO(int[] a, int n) {
  int c0 = 0, c1 = 0, c2 = 0;
  int i = 0;
  while (i < n) {
   if (a[i] == 0) {
    c0++;
   }
   if (a[i] == 1) {
    c1++;
   }
   if (a[i] == 2) {
    c2++;
   }
   i++;
  }
  i = 0;
  while (c0 > 0) {
   a[i++] = 0;
   c0--;
  }
  while (c1 > 0) {
   a[i++] = 1;
   c1--;
  }
  while (c2 > 0) {
   a[i++] = 2;
   c2--;
  }

 }

 public static void main(String[] args) throws IOException {
  BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
  int t = Integer.parseInt(b.readLine().trim());

  while (t > 0) {
   int n = Integer.parseInt(b.readLine().trim());
   int[] array = new int[n];
   String inputLine[] = b.readLine().trim().split(" ");
   for (int i = 0; i < n; i++) {
    array[i] = Integer.parseInt(inputLine[i]);
   }
   zeroandONE_TWO(array, n);

   StringBuffer s = new StringBuffer();
   for (int i = 0; i < n; i++) {
    s.append(array[i] + " ");
   }

   System.out.println(s);
   t--;

  }
 }
}

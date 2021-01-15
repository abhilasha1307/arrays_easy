package ARRAYS.ARRAYS_easy;

import java.util.*;
/*
===============
PROBLEM:)
===============
Given two sorted arrays of distinct elements. There is only 1 difference between the arrays. First array has one element extra added in between. Find the index of the extra element.

N = 7
A[] = {2,4,6,8,9,10,12}
B[] = {2,4,6,8,10,12}
Output: 4
*/

/*
============
APPROACH:)
=============
arrays are already sorted; we are only given the size of bigger array (n)
first we check for the last element in both arrays; if they are not same then n-1 is the answer. here n-1 is the last index of bigger array
we set 3 variables f = 0, l at n-2 (last element of smaller array)
while f is not >= l; we set m at mid of f and l
if the mid element in both arrays are same; it means that all elements before that are also same as both arrays differ by only 1 element; all rest elements 
are same. here we shift f to m+1

if mid element are not same then we store m in i as this could be the element thats extra and then we shift l to m-1

we reset mid to f+l/2 (this we why stored m in i) and then check if a[m] = b[m];
if yes shift f; if no, shift l and store this new m in i too


if there is no extra element at all; we return n. this is becoz, n is not a legal index (legal index are only from 0 to n-1) and getting 'n' as answer 
indicates that no extra element was found

time : O(log n) [binary search used with mid, first, last element]
space:  O(1)
*/
public class p10_index_of_extra_element {

 public static int findExtra(int a[], int b[], int n) {

  if (a[n - 1] != b[n - 2]) {
   return n - 1;
  }

  int f = 0, l = n - 2;
  int i = n; // return i = n if no extra element
  while (f <= l) {
   int m = (f + l) / 2;

   if (b[m] == a[m]) // bcoz b has less elements, else we get AIOOBE
   {
    f = m + 1;
   }

   else {
    i = m;
    l = m - 1;
   }
  }
  return i;
 }

 public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  int t = s.nextInt();
  while (t > 0) {
   int n = s.nextInt();
   int[] a = new int[n];
   int[] b = new int[n - 1];

   for (int i = 0; i < n; i++) {
    a[i] = s.nextInt();
   }

   for (int j = 0; j < n - 1; j++) {
    b[j] = s.nextInt();
   }

   System.out.println(findExtra(a, b, n));
   t--;
  }

  s.close();
 }

}

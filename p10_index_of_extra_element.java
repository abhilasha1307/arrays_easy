package ARRAYS_easy;

/*
===============
PROBLEM:)
===============
Given two sorted arrays of distinct elements. There is only 1 difference between the arrays. First array has one element extra added in between. Find the index of the extra element.

Expected Time Complexity: O(log N).
Expected Auxiliary Space: O(1).

Constraints:
2<=N<=10^4
1<=Ai<=10^5

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
check for the last element in both arrays; if they are not same then n-1 is the answer.
Perform BS on smaller array. f = 0, l at n-2
IF MID IS HAS THE SAME ELEMENT IN BOTH THE ARRAY WE WILL SHIFT f = mid+1. THERE IS NO DIFFERENCE IN THE VALUE OF ELEMENTS IN EITHER ARRAY BEFORE INDEX= MID
if mid element are not same then we store m in i as this could be the element thats extra and then we shift l to m-1

we reset mid to f+l/2 (this we why stored m in i) and then check if a[m] = b[m];
if yes shift f; if no, shift l and store this new m in i too

if there is no extra element at all; we return n. this is becoz, n is not a legal index

time : O(log n) 
space:  O(1)
*/
public class p10_index_of_extra_element {

 public static void main(String[] args) {
  int[] arr1 = new int[] { 2, 4, 6, 8, 9, 10, 12 };
  int[] arr2 = new int[] { 2, 4, 6, 8, 10, 12 };

  int N = 7;

  System.out.println(findExtra(arr1, arr2, N));

 }

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

}

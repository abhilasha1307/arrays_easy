package ARRAYS.ARRAYS_easy;

/*
================================================
PROBLEM:) 
================================================
Given an array a[] of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array.

Constraints:
1 <= N <= 105
0 <= A[i] <= N-1, for each valid i

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).
Note : The extra space is only for the array to be returned.
Try and perform all operation withing the provided array. 
=========================================
EXAMPLES:
=========================================
Input:
N = 4
a[] = {0,3,1,2}
Output: -1

Input:
N = 5
a[] = {2,3,1,2,3}
Output: 2 3 
========================================
*/

/*
=============================================
APPROACH:)
==============================================
As we have to do this in constant space (except the space for list to be returned), we will make changes in the the given array
we traverse the array, we go to the index arr[i]%n (as we may have to cycle through the unsorted array) and increment the value at this index by 'n'
after this, we again traverse through the array, indices i for which arr[i]/n > 1 are the elements which are present more than once in the array

This approach works because all elements are in range from 0 to n-1 and arr[i]/n would be greater than 1 only if a value "i" has appeared more than once.

Time : O(N)
Space : O(N)
*/
import java.util.*;

public class p13_find_duplicates {
 public static void main(String[] args) {
  int[] arr = new int[] { 2, 3, 1, 2, 3 };
  int n = arr.length;
  System.out.println(duplicates(arr, n));
 }

 public static ArrayList<Integer> duplicates(int arr[], int n) {
  ArrayList<Integer> list = new ArrayList<>();

  for (int i = 0; i < arr.length; i++) {
   int a = arr[i] % n;
   arr[a] += n;
  }

  for (int i = 0; i < arr.length; i++) {
   if (arr[i] / n > 1) {
    list.add(i);
   }
  }

  if (list.size() == 0) {
   list.add(-1);
  }

  return list;
 }

}

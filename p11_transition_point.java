package ARRAYS_easy;

/*
==========
PROBLEM:)
==========
You are given a sorted array containing only numbers 0 and 1. Find the transition point efficiently. The transition point is a point where "0" ends and "1" begins (0 based indexing).
Note that, if there is no "1" exists, print -1.
Note that, in case of all 1s print 0.

Expected Time Complexity: O(LogN).
Expected Auxiliary Space: O(1).

N = 5
arr[] = {0,0,0,1,1}
Output: 3 (INDEX)
*/

/*
==========================
APPROACH:)
=========================
we set l at 0 and h at n-1; mid = (l+h)/2 while l<=h
as the array is sorted, if arr[mid] == 0, shift 'l' to mid+1 as all elements before arr[mid] will be zero

if mid is zero (will happen when there are 1 or 2 elements in the array) or mid>0 and element before mid is 0 we retun mid 
else shift h to mid-1;

if there is no transition point (when there are only zeros or a single element array having just zero) return -1
for a single element array having 1, transition point is 1 (and not -1)

Time Complexity: O(LogN).
Space : O(1)
*/

public class p11_transition_point {
 public static void main(String[] args) {
  int[] arr = new int[] { 0, 0, 0, 1, 1 };
  int n = arr.length;

  System.out.println(transitionPoint(arr, n));
 }

 static int transitionPoint(int arr[], int n) {
  int l = 0;
  int h = n - 1;
  while (l <= h) {
   int mid = (l + h) / 2;

   if (arr[mid] == 0) {
    l = mid + 1;
   }

   else {
    if (mid == 0 || (mid > 0 && arr[mid - 1] == 0)) {
     return mid; // return mid = 0 when all the elements are = 1
    }
    h = mid - 1;
   }
  }
  return -1;
 }

}

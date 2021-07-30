package ARRAYS_easy;

/*
===================================================================================
PROBLEM:)
===================================================================================
A peak element in an array is the one that is not smaller than its neighbours.
Given an array of size N, find the index of any one of its peak elements.

Expected Time Complexity: O(log N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 10^5
1 <= A[] <= 10^6

================================================================
EXAMPLES:
================================================================
N= 3
arr[] = {1,2,3}
Output: 2 
*/

/*
===============================================================================
APPROACH:)
==============================================================================
Here the answer is the first peak element found, there might be other peak elements in the array, or elements that are greater in value then the answer
we find the mid element and check if its the peak element(it should be >= to the neighbouring elements)
if the element is the 0th in the array or the last element, they onl have one neighbour
else if the current mid element is smaller than element at mid-1, we will search for peak in 0 to mid-1 (as there is already an element which is greater than one of the neighbours)
else we search in mid+1 to arr.length 

Time: O(log N)
Space: O(1)
*/
public class p14_peak_element {

 public static void main(String[] args) {
  int[] arr = new int[] { 10, 20, 15, 2, 23, 90, 67 };
  System.out.println(peakElement(arr, arr.length));
 }

 public static int peakElement(int[] arr, int n) {
  return Util(arr, 0, n - 1, n);
 }

 private static int Util(int[] arr, int l, int h, int n) {
  int mid = (l + h) >> 1;
  if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
   return mid;
  } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
   return Util(arr, l, mid - 1, n);
  }

  else {
   return Util(arr, mid + 1, h, n);
  }
 }
}

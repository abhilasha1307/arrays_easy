package ARRAYS_easy;

// look for better solutions
/* 
===============================
PROBLEM:)
==============================
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
Find the kth positive integer that is missing from this array.

1 <= arr.length <= 1000
1 <= arr[i] <= 1000
1 <= k <= 1000
arr[i] < arr[j] for 1 <= i < j <= arr.length
*/

/*
=============================
APPROACH:)
=============================
INTUITION : Keep track of how many positive numbers are missing as you scan the array.

We first have to check if the element needed is in the range of first and last element of array or not
as the array is in strictly increasing order, if the last element is greater than the length of the array + k then the element is within the range of first and last element of the array
else we return the value (arr.length + k)

more on the 1st case :
we will make a hash table of size such that the biggest element in the input array is the last index in the hash table
we fill the hash table : every element in the i/p array is taken to be the index and value at that index is incremented by one (no duplicates in the input array)

make a variable 'index'
loop over the array from 1 till the end (1 bcoz 1 <= arr[i] <= 1000), we check if k>0 (as we want to find the Kth element) and hash[j] == 0(means this element is not present in the array given)
we store the index (represents the elements of the array) in 'index' and decrement k by one
we do this till k is 0
when k is 0, the index at which 'j' is at is the Kth misiing element of the array and for this we go into else if block and break out of the loop and return the 'index'.

Time : O(n) ; two loops of O(n) each; sum of two linear function is a linear function
Space : O(m)

m = greatest element of the input array(cannot be more than 1000 [constraint]) + 1
*/

public class x26_Kth_missing_positive_number {
 public static int findKthMissingElement(int[] arr, int k) {

  if (arr[arr.length - 1] >= arr.length + k) {
   int n = arr[arr.length - 1] + 1;
   int[] hash = new int[n];

   // filling hash table
   for (int i = 0; i < arr.length; i++) {
    int index = arr[i];
    hash[index] = 1;
   }

   int index = 0;
   for (int j = 1; j < hash.length - 1; j++) {
    if (k > 0 && hash[j] == 0) {
     index = j;
     k--;
    }

    else if (k == 0) {
     break;
    }
   }

   return index;
  }

  else {
   return arr.length + k;
  }

 }

 public static void main(String[] args) {

  int[] arr = new int[] { 2, 3, 4, 7, 11 };
  int k = 5;

  System.out.println(findKthMissingElement(arr, k));

 }
}
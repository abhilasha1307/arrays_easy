package ARRAYS.ARRAYS_easy;
//done

// different approachs (i started traversing from beginning and had to write code for sort separately)
import java.util.Scanner;

/* 
===========================
PROBLEM:) 
===========================
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
Note:
The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.

nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
*/

/*
==========================
APPROACH:)
==========================
traverse from back? all nums2 elements are smaller than all nums1 elements and all nums1 elements are smaller than nums 2 element?
we set 3 variables k (at end of nums1), i(after the last non zero element of nums1), j(at length of nums2)
till i and j are greater than zero we check which element is greater and put that in the last at arr[k]
then decrement j or i and also k

if all nums2 elements are smaller than all nums1 elements : all the elements of nums1 will be sent back and the first loop will be over
we will have to use the second loop in this case to bring the elements of nums2 in nums1

if all nums1 elements are smaller than nums2 element :
we dont have to move i at all here. Just put each element in nums2 in nums1 in order of which they appear

time : O(m+n) (check)
space : O(1), no additonal array made, we just made 3 variables
*/

public class x5_merge_sorted_array {

 public static void merge(int[] nums1, int m, int[] nums2, int n) {

  int k = (m + n) - 1;
  int i = m;
  int j = n;
  while (i > 0 && j > 0) {
   if (nums1[i - 1] > nums2[j - 1]) {
    nums1[k] = nums1[--i];
    k--;
   } else {
    nums1[k] = nums2[--j];
    k--;
   }
  }
  while (j > 0) {
   nums1[k] = nums2[--j];
   k--;
  }
  for (int x = 0; x < m + n; x++) {
   System.out.print(nums1[x] + " ");
  }
  System.out.println();
 }

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int m = in.nextInt();
  int n = in.nextInt();
  int[] nums1 = new int[m + n];
  int[] nums2 = new int[n];
  for (int i = 0; i < m + n; i++) {
   nums1[i] = in.nextInt();
  }
  for (int j = 0; j < n; j++) {
   nums2[j] = in.nextInt();
  }

  merge(nums1, m, nums2, n);
  in.close();
 }

}

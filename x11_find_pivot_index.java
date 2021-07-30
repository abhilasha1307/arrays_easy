package ARRAYS_easy;

//done; explain approach
import java.util.Scanner;

/*
=====================================
PROBLEM:) #724  Find Pivot Index
=====================================
Given an array of integers nums, write a method that returns the "pivot" index of this array.
We define the pivot index as the index where the sum of all the numbers to the left of the index is equal to the sum of all the numbers to the right of the index.
If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.

Input: nums = [1,7,3,6,5,6]
Output: 3 [index]
*/

/*
=====================
APPROACH:)
=====================
we add all the elements of the array

lhs is the the sum of elements to the left of current element
starting from i =0,(lhs is also 0) we compare lhs with sum - lhs - nums[i] (we have to exclude the current element and also terms on left to get the sum of elements on right)

if equal we return the index of current element
else we just update lhs with the current value + prev lhs value (lhs += nums[i])

if there is no such element for which sum of elements on lhs is equal sum of elements on rhs we return -1;

time : O(n)
Space : O(1)
*/
public class x11_find_pivot_index {
 public static int pivotIndex(int[] nums) {

  int sum = 0;
  int lhs = 0;
  for (int x : nums) {
   sum += x;
  }

  for (int i = 0; i < nums.length; ++i) {
   if (lhs == sum - lhs - nums[i]) { // nums[i] is included bcoz we want to compare lhs sum and rhs sum form a said
                                     // element as in, that element is not included and hence subtracted in the
                                     // equation
    return i;
   }
   lhs += nums[i];
  }
  return -1;
 }

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int m = in.nextInt();
  int[] nums = new int[m];
  for (int i = 0; i < m; ++i) {
   nums[i] = in.nextInt();
  }
  int A = pivotIndex(nums);
  System.out.println(A);
  in.close();
 }
}
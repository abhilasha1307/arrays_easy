package ARRAYS_easy;
//hashset and bit manipulation

import java.util.*;
/*
=======================
PROBLEM:) 268
=======================
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

n == nums.length
1 <= n <= 104
0 <= nums[i] <= n
All the numbers of nums are unique.
*/

/*
==========================
APPROACH:)
==========================
sort the array
as the elements range from 0 to n and the size of array is n, after sorting, elements at every index should be equal to the index
if it isn't, then thats the missing element

Time : O(n logn)
Space : O(1)
*/
public class x17_missing_number {
 public static int missingNumber(int[] nums) {

  Arrays.sort(nums);

  if (nums[nums.length - 1] != nums.length) {
   return nums.length;
  }

  else if (nums[0] != 0) {
   return 0;
  }

  for (int i = 1; i < nums.length; i++) {
   if (nums[i] != i) {
    return i;
   }
  }
  return -1;
 }

 public static void main(String[] args) {
  int[] arr = new int[] { 3, 0, 1 };

  System.out.println(missingNumber(arr));

 }
}

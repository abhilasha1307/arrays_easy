package ARRAYS.ARRAYS_easy;

/*
========================================
PROBLEM:) 665
=========================================
Given an array nums with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.
We define an array is non-decreasing if nums[i] <= nums[i + 1] holds for every i (0-based) such that (0 <= i <= n - 2).

1 <= n <= 10 ^ 4
- 10 ^ 5 <= nums[i] <= 10 ^ 5
*/

/*
==========================================
APPROACH:)
==========================================
we make a variable count to count the number of times we made changes to make the array non decreasing
in the loop we start from 1 and compare the present and previous element
if the current element is >= prev element. its a non decreasing array for these two elements and we increment i

else we will change the nums[i-1] to nums[i] if i<2
for i is >=2
if the array is found non decreasing, we check if the nums[i-2] is also greater than nums[i]
(we know for the said elements that nums[i-1] is > than nums[i] but since we didn't stop at nums[i-1] this means that nums[i-1] is >= nums[i-2])
if yes, we change nums[i] to nums[i-1] (if we change nums[i-1] to nums[i]; nums[i-2], nums[i-1] will dissatisfy the condition of non decrease)

but if nums[i-2]<nums[i] (and also nums[i-2] < nums[i-1]) changing nums[i-1] to nums[i] will make the array non decreasing

if we have to make more than one change, return false, else true

Time: O(n)
Space : O(1)
*/

public class x18_non_decreasing_array {

 public static boolean checkPossibility(int[] nums) {

  if (nums.length == 1)
   return true;

  int count = 0;
  for (int i = 1; i < nums.length && count < 2; i++) {
   if (nums[i] >= nums[i - 1]) {
    continue; // non-decrease
   }

   if (i - 2 >= 0 && nums[i - 2] > nums[i]) {
    nums[i] = nums[i - 1];
   } else {
    nums[i - 1] = nums[i];
   }
   count++;
  }
  return count < 2;
 }

 public static void main(String[] args) {
  int[] nums = new int[] { -1, 4, 2, 3 };

  System.out.println(checkPossibility(nums));
 }

}
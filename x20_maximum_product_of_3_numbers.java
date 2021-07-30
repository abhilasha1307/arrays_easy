package ARRAYS_easy;

/*
===================================================
PROBELM:)  628
===================================================
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

3 <= nums.length <= 104
-1000 <= nums[i] <= 1000
*/

/*
===================================================
APPROACH:)
===================================================
sort the array.
as the array can have negative numbers, there can be two pairs which will give the maximum product

if the first two elements are negative, product of these with the last element might give the max product
else we might get the max product from product of the last three elements

Time : O(n*logn)
Space : O(1)
*/
import java.util.Arrays;

public class x20_maximum_product_of_3_numbers {

 public static int maximumProduct(int[] nums) {

  Arrays.sort(nums);
  int l = nums.length;
  return (Math.max(nums[l - 1] * nums[l - 2] * nums[l - 3], nums[0] * nums[1] * nums[l - 1]));
 }

 public static void main(String[] args) {
  int[] arr = new int[] {};
  System.out.println(maximumProduct(arr));
 }
}
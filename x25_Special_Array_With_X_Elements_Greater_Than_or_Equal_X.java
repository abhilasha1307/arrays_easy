package ARRAYS_easy;
//try w/ BS and SC = O(n)

//1608

/*

You are given an array nums of non-negative integers. nums is considered special if there exists a number x such that there are exactly x numbers in nums that are greater than or equal to x.

Notice that x does not have to be an element in nums.

Return x if the array is special, otherwise, return -1. It can be proven that if nums is special, the value for x is unique.
*/

public class x25_Special_Array_With_X_Elements_Greater_Than_or_Equal_X {

 public static int specialArray(int[] nums) { // checked for indices (including the length) instead of the elements
                                              // present in the array

  for (int i = 0; i <= nums.length; i++) {
   int count = 0;
   for (int j = 0; j < nums.length; j++) {
    if (nums[j] >= i) {
     count++;
    }
   }

   if (count == i) {
    return i;
   }
  }

  return -1;
 }

 public static void main(String[] args) {

  int[] arr = new int[] { 3, 5 };
  System.out.print(specialArray(arr));
 }
}

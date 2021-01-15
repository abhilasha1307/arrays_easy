package ARRAYS.ARRAYS_easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
===================
PROBLEM:)
===================
Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
Find all the elements of [1, n] inclusive that do not appear in this array.
Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

[4,3,2,7,8,2,3,1]

Output:
[5,6]
*/

/*
====================
APPROACH:) 
====================
we make an arraylist object result
in variable 'index' we store current element (nums[i])

if element at (index - 1) is positive, we go and make it negative (* -1)
if its already negative we increment i

then we will check at what elements are still positive; the index of these elements are the number that dont appear in the array given
return arraylist

time : O(n)
space : O(1)
*/
public class x13_number_disappeared_in_array {
 public static List<Integer> findDisappearedNumbers(int[] nums) {
  List<Integer> result = new ArrayList<>();
  for (int i = 0; i < nums.length; i++) {
   int index = nums[i];
   if (nums[Math.abs(index) - 1] > 0) {
    nums[Math.abs(index) - 1] = -1 * nums[Math.abs(index) - 1];
   }
  }

  for (int i = 0; i < nums.length; i++) {
   if (nums[i] > 0) {
    result.add(i + 1); // element will be i+1
   }
  }
  return result;

 }

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int len = in.nextInt();
  int[] arr = new int[len];
  for (int i = 0; i < len; i++) {
   arr[i] = in.nextInt();
  }
  List<Integer> s = findDisappearedNumbers(arr);
  System.out.print(s);
  in.close();

 }

}

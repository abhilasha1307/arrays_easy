package ARRAYS_easy;

import java.util.*;

//try swapping with XOR
//Bit manipulation basics and questions on XOR on tutorials point

/*
================================================================
PROBLEM:
================================================================
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
*/

/*
===============================================================
APPROACH: Bit Manipulation
================================================================
If we take XOR of zero and some bit, it will return that bit
a ⊕ 0 = a
If we take XOR of two same bits, it will return 0
 a ⊕ a = 0
a ⊕ b ⊕ a = ( a ⊕ a ) ⊕ b = 0 ⊕ b = b
So we can XOR all bits together to find the unique number.

Time: O(n);
Space: O(1)
*/
public class x37_Single_number {
 public static void main(String[] args) {
  int[] arr = new int[] { 4, 1, 2, 1, 2 };
  System.out.println(singleNumber(arr));
  System.out.println(singleNumberMath(arr));
 }

 public static int singleNumber(int[] nums) {
  int x = 0;
  for (int i : nums) {
   x ^= i;
  }
  return x;
 }

 // 2*(a+b+c) - (a+a+b+b+c) = c
 public static int singleNumberMath(int[] nums) {
  Set<Integer> set = new HashSet<>();
  int sumOfset = 0, sumOfNumbers = 0;

  for (int i : nums) {
   if (!set.contains(i)) {
    set.add(i);
    sumOfset += i;
   }
   sumOfNumbers += i;
  }

  return (2 * sumOfset - sumOfNumbers);
 }
}

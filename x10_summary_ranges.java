package ARRAYS_easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/* 
=====================================
PROBLEM:) #228 (EASY) summary ranges
=====================================
You are given a sorted unique integer array nums.
Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b 

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
*/

/*
==================
APPROACH:)
==================
we make an arraylist of generic type string

starting from i = 0, we store the first element if the said range in n
while the next element is 1+ the current element we just shift i forward till that is no the case (and we will make a different range for that)

if n is not the current element we make a range from n -> current element (nums[i]) and add to arraylist
if n is same as current element we just add it to the arraylist made without using ->

return the arraylist and print it

time : O(n)
space : O() //check

*/
public class x10_summary_ranges {
 public static List<String> summaryRanges(int[] nums) {

  List<String> res = new ArrayList<>();
  for (int i = 0; i < nums.length; i++) {
   int n = nums[i];
   while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) { // nums.length -1 bcoz we are using nums[i+1]; else we
                                                               // get AIOOBE
    i++;
   }

   if (n != nums[i]) {
    res.add(n + "->" + nums[i]);
   }

   else {
    res.add(n + "");
   }
  }
  return res;
 }

 public static void main(String[] args) {

  Scanner in = new Scanner(System.in);
  int m = in.nextInt();
  int[] nums = new int[m];
  for (int i = 0; i < m; ++i) {
   nums[i] = in.nextInt();
  }
  List<String> A = summaryRanges(nums);
  System.out.println(A);
  in.close();
 }
}

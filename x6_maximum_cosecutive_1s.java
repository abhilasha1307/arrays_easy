package ARRAYS.ARRAYS_easy;

import java.util.Scanner;
/*
==========================================
PROBLEM:) #88(easy)  Max Consecutive Ones
==========================================
Given a binary array, find the maximum number of consecutive 1s in this array.
NOTE:
The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000

Input: [1,1,0,1,1,1]
Output: 3
*/

/*
=====================
APPROACH:) 
=====================
we make 2 variables total and count
if current element is 1 we increment count (till be encounter a zero); else if total<count we update total = count and set count to zero
after traversing the whole array; we will compare if total is greater or count and return that which is greater

total keeps track of the prev number of consec ones and count keeps track of the current number of consec ones

time : O(n)
space :O(1)

*/

public class x6_maximum_cosecutive_1s {
 public static int findMaxConsecutiveOnes(int[] nums) {
  if (nums.length == 1) {
   return nums[0];
  }
  int count = 0;
  int total = 0;
  for (int i = 0; i < nums.length; i++) {
   if (nums[i] == 1) {
    count++;
   } else {
    if (total < count) {
     total = count;
    }
    count = 0;
   }
  }
  if (total < count)
   return count;

  return total;
 }

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int m = in.nextInt();
  int[] nums = new int[m];
  for (int i = 0; i < m; i++) {
   nums[i] = in.nextInt();
  }
  int sol = findMaxConsecutiveOnes(nums);
  System.out.println("number of cosecutive ones " + sol);
  in.close();
 }
}

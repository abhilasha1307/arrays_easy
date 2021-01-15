package ARRAYS.ARRAYS_easy;

import java.util.Scanner;
/*
=========================================
PROBLEM:)  #605(EASY)  Can Place Flowers
==========================================
Suppose you have a long flowerbed in which some of the plots are planted and some are not. However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.

Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty), and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.

Input: flowerbed = [1,0,0,0,1], n = 1
Output: True

Input: flowerbed = [1,0,0,0,1], n = 2
Output: False
*/

/*
========================
APPROACH:)
========================
condition: fb[i] = 0 & [either i=0 or value at prev index is zero] &[either i is the last index or value ahead of i is zero]
we have to keep in mind that first and last element can also be the place where we can plant flowers; so that has also been checked through above condition

if c is = n then obviosly we can plant but if c>n, the also its possible as we sent less plants but actually had more space for more plants;
so we return true for when C>=n

time: O(n)
space: O()
*/
public class x8_can_place_flowers {
 public static boolean canPlaceFlowers(int[] flowerbed, int n) {
  int c = 0;
  int i = 0;
  int x = flowerbed.length;
  while (i < x) {

   if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == x - 1 || flowerbed[i + 1] == 0)) {
    c++;
    i++;
   }

   i++;

  }

  if (c >= n) {
   return true;
  }
  return false;
 }

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int m = in.nextInt();
  int[] nums = new int[m];
  for (int i = 0; i < m; i++) {
   nums[i] = in.nextInt();
  }
  int n = in.nextInt();
  boolean A = canPlaceFlowers(nums, n);
  System.out.println(A);
  in.close();
 }
}

/*
 * my approach:) couldnt satisfy 0 0 0 0 0 0 1 0 1 0 0 0 0 1 0 0; public static
 * boolean canPlaceFlowers(int[] flowerbed, int n) { int c = 0; int x =
 * flowerbed.length; for (int i = 1; i < x - 1; i++) { if (flowerbed[i] == 0) {
 * if (flowerbed[i] == flowerbed[i + 1] && flowerbed[i] == flowerbed[i - 1]) {
 * c++; } } } if (flowerbed[0] == 0) c++; if (flowerbed[x - 1] == 0) c++;
 * 
 * if (c == 1) { if (n <= c) { return true; } }
 * 
 * if (c % 2 == 0) { if (n <= c / 2) return true; }
 * 
 * else { if (n <= (int) (c / 2 + 1)) { return true; } }
 * 
 * return false; }
 */
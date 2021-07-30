package ARRAYS_easy;

/*
===================================
PROBLEM:) 1470
===================================
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].

1 <= n <= 500
nums.length == 2n
1 <= nums[i] <= 10^3
*/

/* 
=====================================
APPROACH:)
=========================================
We have a i/p array of size 2n, so we use two loop counters i and j starting from 0 and n repespectively
We make a new a new array of size same as input array, to store our shuffled o/p in (Not a in place solution)

how to fill the result array
we make a loop counter k starting from zero;
if k is even(0 included) we store one element from the first half of the input array and increment i after this
else when k is odd, we store one element from 2nd half of the input array in the result array and increment j after this

increment k after this(we are still within the loop at this point)
we do this till j is = nums.length -1;

Time : O(n). One for loop with two counters covering 1/2 of the given input array each i -> n and j -> n (as size is 2n)
Space : O(2n) => O(n), for the array 'res' which will be returned

*/

public class x32_shuffle_the_array {
 public static int[] shuffle(int[] nums, int n) {
  int[] res = new int[nums.length];

  for (int i = 0, j = n, k = 0; j < nums.length;) {
   if (k % 2 == 0) {
    res[k] = nums[i++];
   } else {
    res[k] = nums[j++];
   }

   k++;

  }

  return res;
 }

 public static void main(String[] args) {
  int[] arr = new int[] { 1, 2, 3, 4, 4, 3, 2, 1 };
  int n = 4;

  int res[] = shuffle(arr, n);

  for (int x : res) {
   System.out.print(x + " ");
  }
 }
}

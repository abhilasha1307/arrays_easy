package ARRAYS.ARRAYS_easy;

/*
==================================================
PROBLEM:)  1464
==================================================
Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).

2 <= nums.length <= 500
1 <= nums[i] <= 10^3
*/

/*
==================================================
APPROACH:)
==================================================
we make two variables 'm1' and 'm2' 
for each element in the array, we check if element>m1
if yes we assign m2 = m1 and m1 = x
but if x is not > m1 but greater than m2, we change m2 to x
after traversal is complete, we return the result

Time : O(n)
Spaec: O(1)
*/

public class x19_maximum_product_of_2_numbers {

 public static int maxProduct(int[] nums) {

  int m1 = Integer.MIN_VALUE;
  int m2 = Integer.MIN_VALUE;

  for (int x : nums) {
   if (x > m1) {

    m2 = m1;
    m1 = x;
   }

   else if (x > m2) {
    m2 = x;
   }
  }

  return (m1 - 1) * (m2 - 1);
 }

 public static void main(String[] args) {
  int[] arr = new int[] { 1, 5, 4, 5 };

  System.out.println(maxProduct(arr));
 }
}

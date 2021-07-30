package ARRAYS_easy;

import java.util.*;

/*
================================================
PROBLEM :) 217
================================================
Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
*/

/*
=================================================
APPROACH :)
=================================================
Make a HashSet of size same as the array given
while inserting each element from array into the set we check simultaneouly if the said element is already present in the set
if yes, return true; else false

Time : O(n). We do search() and insert() for n times and each operation takes constant time.
Space : O(n). The space used by a hash table is linear with the number of elements in it.

For certain test cases with not very large n, the runtime of this method can be slower than Soritng approach
The reason is hash table has some overhead in maintaining its property. 
The Big-O notation only tells us that for sufficiently large input, one will be faster than the other. 
Therefore, when n is not sufficiently large, an O(n) algorithm can be slower than an O(nlogn) algorithm.
*/

/*
========================================================
ALTERNATE APPROACH :) SOERING 
========================================================

Arrays.sort(nums);
for(int i = 0; i<nums.length-1; i++)
{
 if(nums[i] == nums[i+1])
 {
  return true;
 }
}
return false;

Time : O(n logn)
Space : O(1)

The implementation here modifies the original array by sorting it, which in general is not a good practice unless its clear to the caller.
Make a copy of nums and operate on the copy to avoid above
*/

public class x15_contains_duplicate {

 public static boolean containsDuplicate(int[] nums) {

  Set<Integer> set = new HashSet<>(nums.length);
  for (int x : nums) {
   if (set.contains(x))
    return true;
   set.add(x);
  }
  return false;

 }

 public static void main(String[] args) {

  int[] A = new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
  System.out.println(containsDuplicate(A));
 }

}

package ARRAYS_easy;

import java.util.*;

/*
==================================================================================
PROBLEM:) 697
==================================================================================
Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.
Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.

Constraints:
nums.length will be between 1 and 50,000.
nums[i] will be an integer between 0 and 49,999.
 
=================================================================================
EXAMPLES:
=================================================================================
Input: nums = [1,2,2,3,1,4,2]
Output: 6; [2,2,3,1,4,2]
*/

/*
===============================================================================
APPPROACH:)
===============================================================================
We make 3 hashMaps, left for the leftmost occurence of each element in the array, right for the rightmost occurence and count to count the frequency of each element
Degree will be the maximum frequency among all the elements

if we are visiting an element for the first time (left.get(element) == null), we add it to left hashMap
set variable length to nums.length and degree to the maximum value in the values of count hashMap
for every key in count hashMap, we check if its degree is same as the degree of the array given(as we have to reduce length)
The shortest such subarray would be from the first occurrence of x until the last occurrence.


Time : O(N)
Space: O(N) space used by left, right, and count.
*/

/*
===============================================================================
ALTERNATE APPROACH:)
===============================================================================
 Map<Integer, Integer> left = new HashMap<>(), count = new HashMap<>();

  int degree = 0, length = 0;
  for (int i = 0; i < nums.length; i++) {
   left.putIfAbsent(nums[i], i);
   count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
   if (count.get(nums[i]) > degree) {
    degree = count.get(nums[i]);
    length = i - left.get(nums[i]) + 1;
   }

   else if (count.get(nums[i]) == degree) {
    length = Math.min(length, i - left.get(nums[i]) + 1);
   }
  }

  //getOrDefault will give the number of times, 'x' has occured and or will
 //return 0 if 'x' is not present in the count hashmap and add 1 to it
  
  return length;
*/
public class x33_degree_of_array {
  public static void main(String[] args) {
    int[] arr = new int[] { 1, 2, 2, 3, 1, 4, 2 };
    System.out.println(findShortestSubArray(arr));
  }

  public static int findShortestSubArray(int[] nums) {
    HashMap<Integer, Integer> left = new HashMap<>(), right = new HashMap<>(), count = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int x = nums[i];
      if (left.get(x) == null) {
        left.put(x, i);
      }
      right.put(x, i);
      count.put(x, count.getOrDefault(x, 0) + 1); // method returns value mapped with the specified key, otherwise
                                                  // default
                                                  // value is returned
    }

    int length = nums.length;
    int degree = Collections.max(count.values());

    for (int x : count.keySet()) {
      if (count.get(x) == degree) {
        length = Math.min(length, right.get(x) - left.get(x) + 1);
      }
    }
    return length;
  }
}

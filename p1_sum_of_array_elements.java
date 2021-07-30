package ARRAYS_easy;
/*
==================
OUESTION:) 
==================
Given an integer array arr of size n, you need to sum the elements of arr.
*/

/*
===============
my_APPROACH : for each loop to traverse through the array and add all the elements
===============
COMPLEXITY: time complexity: O(N); Space: O(1);

===============
APPROACH 2 : while loop can be used too, with decrement in place of increment
===============
time complexity: O(n); where n is the size of array.
*/

public class p1_sum_of_array_elements {

 public static void main(String[] args) {
  int[] arr = new int[] { 1, 2, 3, 4, 5 };
  int n = arr.length;
  System.out.println(Sum(arr, n));

 }

 public static int Sum(int[] arr, int n) {
  int total = 0;

  for (int i : arr) {
   total = total + i;
  }
  return (total);
 }

}
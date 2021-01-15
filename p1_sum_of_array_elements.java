package ARRAYS.ARRAYS_easy;

import java.util.Scanner;

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

class solution {
 public static int Sum(int[] arr, int n) {
  int total = 0;

  for (int i : arr) {
   total = total + i;
  }
  return (total);
 }

 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter length of array: ");
  int length = input.nextInt();
  int[] array = new int[length];
  System.out.println("Enter elements in the array: ");

  for (int i = 0; i < length; i++) {
   array[i] = input.nextInt();
  }
  input.close();
  int sol = Sum(array, length);
  System.out.println("Sum of array elements: " + sol);

 }
}
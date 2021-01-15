package ARRAYS.ARRAYS_easy;

//done
import java.util.Scanner;

/*
=======================
PROBLEM:) 
======================
Given an array of size N consisting of only 0's and 1's. The array is sorted in such a manner that all the 1's are placed first and then they are followed by all the 0's. Find the count of all the 0's.
*/

/*
APPROACH: while loop used to count the no. of 0s in the provided array
COMPLEXITY: time: O(N); Space: O(1).
*/
public class p2_count_zeros {
 public static int Count(int[] arr, int n) {
  int i = 0, count = 0;
  while (i < n) {
   if (arr[i] == 0) {
    count++;
   }
   i++;
  }
  return (count);
 }

 public static void main(String[] args) {
  Scanner s = new Scanner(System.in); // making obj of scanner class
  System.out.println("Enter length of array: ");
  int length = s.nextInt(); // reading input from console
  int[] array = new int[length];
  System.out.println("Enter elements in the array: ");

  for (int i = 0; i < length; i++) {
   array[i] = s.nextInt();
  }
  s.close();
  int sol = Count(array, length);
  System.out.println("Number of zeros in array: " + sol);

 }
}

package ARRAYS.ARRAYS_easy;

import java.io.IOException;

/*
============
PROBLEM:) #12; LEVEL:easy; topic: Arrangement Rearrangement(array DS)
============
Given an array of integers of size N. Assume ‘0’ as invalid number and all other as valid number. Write a program that modifies the array in such a way that if next number is  valid number and is same as current number, double the current number value and replace the next number with 0. After the modification, rearrange the array such that all 0’s are shifted to the end and the sequence of the valid number or new doubled number is maintained as in the original array.

Input : arr[] = {2, 2, 0, 4, 0, 8}
Output : 4 4 8 0 0 0

Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}
Output :  4 2 12 8 0 0 0 0 0 0
 */

/*
=============
APPROACH:)
=============
first we see check for valid elements (!=0) which are eligible for doubling and double them and store result in i-1 index and at i we store 0

now starting from j = 0 till <n; if the element is not zero we send it to front and then inc the count by one. This helps in putting the valid elements in front as if the element at a given index is zero we just increment j till we find a non zero element. during this time count is set on the first zero it encountered as it didnt increase after that. we swap non zero with zero and increment count to move to next element and the process continues

here we have brought the valid elements to front. so automatically zeros were sent to the back

time: O(n)
space: O(1)

*/
public class p7_double_the_1st_ele_move_zero_to_end {
 public static void Sol(int[] arr, int n) {
  int count = 0;
  for (int i = 1; i < n; i++) {
   if (n == 1) {
    return; // if array only has one element; return to main
   }
   if (arr[i - 1] != 0 && arr[i - 1] == arr[i]) {
    arr[i - 1] = arr[i - 1] + arr[i]; // you can multiply with 2 as well
    arr[i] = 0;
   }
  }
  for (int j = 0; j < n; j++) {
   if (arr[j] != 0) {
    int temp = arr[j];
    arr[j] = arr[count];
    arr[count] = temp;
    count++; // increases only for non zero elements
   }
  }

 }

 public static void main(String[] args) throws IOException {
  int[] arr = new int[] { 0, 2, 2, 2, 0, 6, 6, 0, 0, 8 };
  int n = arr.length;

  Sol(arr, n);
 }
}
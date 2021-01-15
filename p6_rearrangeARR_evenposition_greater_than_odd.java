package ARRAYS.ARRAYS_easy;

import java.util.Arrays;

import java.io.*;

/* 
PROBLEM:) #10; LEVEL:easy; topic: Arrangement Rearrangement(array DS)
Given an array A of n elements, rearrange the array according to the following relations :
    A[i] >= A[i-1] , if i is even.
    A[i] <= A[i-1] , if i is odd.[Considering 1-indexed array; therefore positions will start from 1 to n]
Print the resultant array.

1 2 2 1 =>  1 2 1 2
*/
/*
APPROACH:) 
we sort the array first
we set 2 variables x and y at beginning and at end (o and n-1)
we check if i+1 is a even number (if it is that means that i is actually an even position(not index))
as the array is given to be one indexed we have to check for positions by checking the element just ahead of the current element
array are always stored with indices starting from zero

if i+1 is even that means that i is actually at even position in the array; we will put the elements from end here and then do y-- and i++
if i+1 is odd that means i is at odd position in array; we put smaller elements here (taking from x = 0) and then x++ and i++;

time: O(n)
Space: O(n) (we are making a new array A[])
*/
public class p6_rearrangeARR_evenposition_greater_than_odd {
    public static void Solution(int[] arr, int n) {
        Arrays.sort(arr);
        int[] A = new int[n];
        int x = 0, y = n - 1;
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 == 0) { // its a one indexed array
                A[i] = arr[y--];
            } else {
                A[i] = arr[x++];
            }
        }
        for (int k = 0; k < n; k++) {
            System.out.print(A[k] + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        int[] arr = new int[] { 5, 10, 8, 9, 4, 3, 6 };
        int n = arr.length;

        Solution(arr, n);
    }
}

package ARRAYS_easy;

import java.util.*;

/* 
===========================================
PROBLEM:)
===========================================
Given an array A of n elements, rearrange the array according to the following relations :
A[i] >= A[i-1] , if i is even.
A[i] <= A[i-1] , if i is odd.[Considering 1-indexed array; therefore positions will start from 1 to n]
Print the resultant array.

===============================================
EXAMPLE:
A[] = {1, 2, 2, 1}
Output:
1 2 1 2
================================================
*/

/*
================================================
APPROACH:) 
================================================
we sort the array first
we set 2 variables x and y at beginning and at end 
we check if i+1 is a even position (as i is index, the position it is at will be (i+1))

if i+1 is even we will put the elements from the end of the array, in this position
if i+1 is odd we put smaller elements.

time: O(n*log n)
Space: O(1) 
*/

/*
ALTERNATIVELY:
we have to swap 2 adjacent elements(rearrange then when) to satisfy A[i] >= A[i-1] , if i is even and A[i] <= A[i-1] , if i is odd.
so we start the loop from 1 and then check these conditions at each index, if true we swap elements at i and i-1
the resultant will be such that number at even positon (consider array to be starting from 1) will be greater than the numbers to the left and to the right

Time : O(n)
space: O(1)
*/
public class p6_rearrangeARR_evenposition_greater_than_odd {
    public static void main(String[] args) {
        int[] arr = new int[] { 5, 10, 8, 9, 4, 3, 6 };
        int n = arr.length;

        // System.out.println(Solution(arr, n));
        Sol(arr, n);
    }

    public static ArrayList<Integer> Solution(int[] arr, int n) {
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();

        int x = 0, y = n - 1;
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 == 0) { // its a one indexed array
                list.add(arr[y--]);
            } else {
                list.add(arr[x++]);
            }
        }

        return list;
    }

    public static void Sol(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                if (arr[i] > arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            } else {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

}

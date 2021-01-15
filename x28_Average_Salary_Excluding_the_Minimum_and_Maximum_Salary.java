package ARRAYS.ARRAYS_easy;

import java.util.Arrays;

/*
============================================
PROBLEM:)  1491
============================================
Given an array of unique integers salary where salary[i] is the salary of the employee i.
Return the average salary of employees excluding the minimum and maximum salary.

3 <= salary.length <= 100
10^3 <= salary[i] <= 10^6
salary[i] is unique.
Answers within 10^-5 of the actual value will be accepted as correct.
*/

/*
==========================================
APPROACH:)
==========================================
sort the array and add all the elements to a variable 'avg' besides the first and the last element
divide it by arr.length-2 and return

Time : O(nlogn)
Space: O(1)
*/

/*
ALTERNATE SOLUTION:)
public double average(int[] salary) {
        double sum = 0d;
        int M = Integer.MIN_VALUE, m = Integer.MAX_VALUE;
        for (int s : salary) {
            m = Math.min(m, s);
            M = Math.max(M, s);
            sum += s;
        }
        return (sum - m - M) / (salary.length - 2);
    }


    in one pass, we find the sum of the all elements and also the minimum and maximum elements in the array
    return the required avg after taking away the minimum and the maximum of the element from the total sum and dividing by arr.length-2

Time : O(n)
Space : O(1)
*/
public class x28_Average_Salary_Excluding_the_Minimum_and_Maximum_Salary {

  public static double average(int[] salary) {

    Arrays.sort(salary);
    double avg = 0;

    for (int i = 1; i < salary.length - 1;) {
      avg += salary[i];
      i++;
    }

    return (avg / (salary.length - 2));
  }

  public static void main(String[] args) {

    int[] arr = new int[] { 48000, 59000, 99000, 13000, 78000, 45000, 31000, 17000, 39000, 37000, 93000, 77000, 33000,
        28000, 4000, 54000, 67000, 6000, 1000, 11000 };

    System.out.println(average(arr));
  }
}

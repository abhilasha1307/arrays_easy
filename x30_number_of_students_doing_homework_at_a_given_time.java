package ARRAYS_easy;

/*
======================================
PROBLEM:)   1450
======================================
Given two integer arrays startTime and endTime and given an integer queryTime.
The ith student started doing their homework at the time startTime[i] and finished it at time endTime[i].
Return the number of students doing their homework at time queryTime. More formally, return the number of students where queryTime lays in the interval [startTime[i], endTime[i]] inclusive.

startTime.length == endTime.length
1 <= startTime.length <= 100
1 <= startTime[i] <= endTime[i] <= 1000
1 <= queryTime <= 1000
*/

/*
================================
APPROACH:)
================================
initialize a variable students with 0
this is the number of students doing their homework at the given queryTime

for we loop from 0 to starttime.length or endtime.length (given both the lengths are same)
and for each 'i' we check if queryTime is between startTime[i] and endTime[i] (here i is the student and startTime and endTime at i are the startTime and endTime of that one student)
if it is we increment the var students 


return the student variable back to the calling function

Time : O(n)
Space: O(1); No extra space (except space for variable 'i' and 'student') used
*/

public class x30_number_of_students_doing_homework_at_a_given_time {

 public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
  int students = 0;

  for (int i = 0; i < startTime.length; i++) {
   if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
    students++;
   }
  }

  return students;
 }

 public static void main(String[] args) {

  int[] startTime = new int[] { 1, 2, 3 };
  int[] endTime = new int[] { 3, 2, 7 };
  int queryTime = 4;

  System.out.println(busyStudent(startTime, endTime, queryTime));
 }
}

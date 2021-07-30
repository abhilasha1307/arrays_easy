package ARRAYS_easy;

import java.util.ArrayList;

/*
=======================================================
PROBLEM:)  118 (Dp)
========================================================
Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
*/

/*
=======================================================
APPROACH:)
=======================================================
We make a Arraylist 'LIST' that will store lists, where each list will be a level in pascals triangle
if the numsRows is zero, we return an empty list
if not, we start a loop from 0 to numrows
for each i, we make a new list. The first and last element at every level is one; so we use a inner loop from 0 to i and when j is 0 or i, we add 1 to the current list
else, we extract 2 elements from the previous list(i-1) one at j-1 and one at j and add these elements. Add the resultant at 'j' in the current list

after completing the inner loop, add the list to LIST and repeat till i is numRows 


Time : O(n^2) n is numRows. overall loop iterations
Space: O(n^2). To store each number in the triangle
*/
public class x14_pascals_triangle {
 public static ArrayList<ArrayList<Integer>> generate(int numRows) {

  ArrayList<ArrayList<Integer>> LIST = new ArrayList<>();
  if (numRows == 0) {
   return LIST;
  }

  for (int i = 0; i < numRows; i++) {
   ArrayList<Integer> list = new ArrayList<>();

   for (int j = 0; j <= i; j++) {
    if (j == 0 || j == i) {
     list.add(1);
    }

    else {
     int x = LIST.get(i - 1).get(j - 1);
     int y = LIST.get(i - 1).get(j);

     list.add(x + y);
    }
   }

   LIST.add(list);
  }

  return LIST;

 }

 public static void main(String[] args) {
  int numRows = 5;

  ArrayList<ArrayList<Integer>> result = generate(numRows);
  for (int i = 0; i < result.size(); i++) {
   System.out.println(result.get(i));
  }
 }
}

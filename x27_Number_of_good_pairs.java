package ARRAYS_easy;

/*
=====================================
PROBLEM:) 1512
=====================================
Given an array of integers nums.
A pair (i,j) is called good if nums[i] == nums[j] and i < j.
Return the number of good pairs.

1 <= nums.length <= 100
1 <= nums[i] <= 100
*/

/*
====================================
APPROACH 1 :) brute force :
=====================================
just use 2 nested loops with i = 0 to length and j = i+1 to length
for every j we check we check whether nums[i] is same as nums[j] and if it is , we increment the pairs variable
here we don't need to check i<j as j is starting from i+1

Time : O(n^2);  nested for loops
Space : O(1), no additional space is used

===================================
APPROACH 2:) Hash table and sorting
===================================
 we find the greatest element in the array with one pass and then make a hash table of size max+1
 we then use a loop to increment in the hash table at indices as the elements in the array are present 
 make a variable pairs to count the number of desired pairs
 
 looping over the hash table, for each element(if its >1) we just make pairs = pairs + (n * (n - 1)) / 2

 return pairs

 LOGIC OF n * (n - 1) / 2 :-
 ------------------------------
  imagine a room with n people, each of whom shakes hands with everyone else. If you focus on just one person you see that she participates in n−1 handshakes. Since there are n people, that would lead to n(n−1) handshakes.
 Note here that we are thinking about the multiplication xy as the total for x groups of y things, not as repeated addition. Computationally they are the same, but psychologically they are different.
 To finish the problem, we should realize that the total of n(n−1) counts every handshake twice, once for each of the two people involved. So the number of handshakes is n(n−1)/2.


 Time : O(n)
 Space : O(max number in the input array + 1) => O(m) 
 
 {space needed cannot be more than O(101) [see constraints]}
 */

/*
SMALL CODE:

public int numIdenticalPairs(int[] nums) {
   int cnt[] = new int[101], res = 0;
   for (var n: nums)
       res += cnt[n]++;  // the equation is solved first and then the cnt[n]++ is done
   return res;
}

 we count the pairs not separately but as we are filling the hashtable(here cnt)

*/

public class x27_Number_of_good_pairs {

    public static int numIdenticalPairs(int[] nums) {

        // brute force O(n^2)
        /*
         * int pairs = 0; for (int i = 0; i < nums.length; i++) { for (int j = i + 1; j
         * < nums.length; j++) { if (nums[i] == nums[j]) { pairs++; } } }
         * 
         * return pairs;
         */

        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
        }

        int hashTable[] = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            int index = nums[i];
            hashTable[index]++;
        }

        int pairs = 0;

        for (int n : hashTable) {
            if (n > 1) {
                pairs += (n * (n - 1)) / 2;
            }
        }
        return pairs;

    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 1, 1, 3 };
        System.out.println(numIdenticalPairs(arr));
    }

}

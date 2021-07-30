package ARRAYS_easy;

//priority queue
import java.util.*;

/*
==================================================
PROBELM:) 1636
==================================================
Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.
Return the sorted array.

1 <= nums.length <= 100
-100 <= nums[i] <= 100
*/

/*
=====================================================
APPROACH:)
=====================================================

*/
public class x23_sort_array_by_increasing_frequency {
  public static int[] frequencySort(int[] nums) {

    /*
     * int[] bucket = new int[201]; // An array bucket to store frequency of numbers
     * ranged between -100 to 100 for (int num : nums) { bucket[num + 100]++; }
     * 
     * HashMap<Integer, List<Integer>> map = new HashMap<>();
     * 
     * for (int i = 200; i >= 0; i--) { if (bucket[i] > 0) { if
     * (!map.containsKey(bucket[i])) map.put(bucket[i], new ArrayList<Integer>());
     * List<Integer> temp = map.get(bucket[i]); temp.add(i - 100);
     * map.put(bucket[i], temp); } }
     * 
     * int[] res = new int[nums.length]; int index = 0; for (Map.Entry<Integer,
     * List<Integer>> entry : map.entrySet()) { int freq = entry.getKey(); for (int
     * x : entry.getValue()) { for (int i = 0; i < freq; i++) { res[index++] = x; }
     * } }
     * 
     * return res;
     */

    HashMap<Integer, Integer> map = new HashMap<>();
    int n = nums.length;

    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    Integer[] sorted = new Integer[n];
    for (int i = 0; i < n; i++) {
      sorted[i] = nums[i];
    }
    Arrays.sort(sorted, new Comparator<Integer>() {

      @Override
      public int compare(Integer a, Integer b) {
        if (map.get(a) == map.get(b)) {
          return b.compareTo(a);
        }
        return map.get(a) - map.get(b);
      }
    });
    return Arrays.stream(sorted).mapToInt(Integer::intValue).toArray();
  }

  public static void main(String[] args) {

    int[] arr = new int[] { -53, -53, 52, 52, 52, 52, -53, -53, 52, -53, 52, 52, 52, -53, 52, 52, -53, 52, -53, 52, -53,
        52, 52, 52, 52, 52, 52, 52, 52, 52, -53, 52, -53, 52, -53, 52, 52, 52, -53, -53, 52, -53, 52, 52, 52, 52, -53,
        -53, -53, -53, -53, 52, 52, -53, 52, -53, 52, 52, 52 };

    int[] res = frequencySort(arr);
    for (int x : res) {
      System.out.print(x + " ");
    }
  }

}

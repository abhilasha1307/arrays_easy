package ARRAYS_easy;

//O(n) time; O(n) space
public class x35_squares_of_sorted_array {
 public static void main(String[] args) {
  int[] nums = new int[] { -4, -1, 0, 3, 10 };
  int[] res = sortedSquares(nums);

  for (int X : res) {
   System.out.print(X + " ");
  }
 }

 public static int[] sortedSquares(int[] nums) {
  int[] arr = new int[nums.length];

  int i = 0, j = nums.length - 1;

  for (int k = arr.length - 1; k >= 0; k--) {
   if (Math.abs(nums[i]) >= Math.abs(nums[j])) {
    arr[k] = nums[i];
    i++;
   } else {
    arr[k] = nums[j];
    j--;
   }
  }

  for (int k = 0; k < arr.length; k++) {
   arr[k] *= arr[k];
  }

  return arr;
 }
}

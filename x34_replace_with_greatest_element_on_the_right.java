package ARRAYS_easy;

public class x34_replace_with_greatest_element_on_the_right {
 public static void main(String[] args) {
  int[] arr = new int[] { 17, 18, 5, 4, 6, 1 };
  int[] res = replaceElements(arr);

  for (int x : res) {
   System.out.print(x + " ");
  }
 }

 public static int[] replaceElements(int[] arr) {

  // Brute force (N^2)

  // int[] res = new int[arr.length];

  // if (arr.length == 1) {
  // res[0] = -1;
  // return res;
  // }

  // for (int j = 0; j < res.length - 1; j++) {
  // int max = 0;
  // for (int i = j + 1; i < arr.length; i++) {
  // if (max < arr[i]) {
  // max = arr[i];
  // }
  // }
  // res[j] = max;
  // }
  // res[res.length - 1] = -1;
  // return res;

  // Traverse right to left; O(N)
  int Max = -1;
  int a = 0;
  for (int i = arr.length - 1; i >= 0; i--) {
   a = arr[i];
   arr[i] = Max;
   Max = Math.max(Max, a);
  }
  return arr;
 }
}

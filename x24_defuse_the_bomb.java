package ARRAYS.ARRAYS_easy;

//1652
/*

You have a bomb to defuse, and your time is running out! Your informer will provide you with a circular array code of length of n and a key k.

To decrypt the code, you must replace every number. All the numbers are replaced simultaneously.

If k > 0, replace the ith number with the sum of the next k numbers.
If k < 0, replace the ith number with the sum of the previous k numbers.
If k == 0, replace the ith number with 0.
As code is circular, the next element of code[n-1] is code[0], and the previous element of code[0] is code[n-1].

Given the circular array code and an integer key k, return the decrypted code to defuse the bomb!
*/

/*
 
*/
public class x24_defuse_the_bomb {
 public static int[] decrypt(int[] code, int k) {

  int[] result = new int[code.length];

  if (k == 0) {
   return result;
  }
  int start = 1;
  int end = k;
  int sum = 0;

  if (k < 0) {
   k = -k;
   start = code.length - k;
   end = code.length - 1;
  }

  for (int i = start; i <= end; i++) {
   sum += code[i];
  }

  for (int j = 0; j < code.length; j++) {
   result[j] += sum;

   sum -= code[(start++) % code.length];
   sum += code[(++end) % code.length];
  }

  return result;
 }

 public static void main(String[] args) {
  int[] arr = new int[] { 2, 4, 9, 3 };
  int k = -2;

  int[] res = decrypt(arr, k);

  for (int x : res) {
   System.out.print(x + " ");
  }
 }

}

// prefix sum approach
/*
 * public int[] decrypt(int[] code, int k) { int[] presum = new
 * int[code.length]; int[] postsum = new int[code.length];
 * 
 * // Create prefix sum array int sum = 0; for (int i = 0; i < code.length; ++i)
 * { sum += code[i]; presum[i] = sum; }
 * 
 * // Create prefix sum array in reverse sum = 0; for (int i = code.length - 1;
 * i >= 0; --i) { sum += code[i]; postsum[i] = sum; }
 * 
 * for (int i = 0; i < code.length; ++i) { if (k > 0) { if ((i + k) <
 * code.length) { code[i] = presum[i + k] - presum[i]; } else { //
 * presum[code.length-1] - presum[i] --> Elements right of i //
 * presum[k-(code.length -i)]; --> Elements left of i code[i] =
 * presum[code.length - 1] - presum[i] + presum[k - (code.length - i)]; } } else
 * if (k == 0) { code[i] = 0; } else { if (i + k >= 0) { code[i] = postsum[i +
 * k] - postsum[i]; } else { // postsum[0] - postsum[i] --> Elements right of i
 * // postsum[code.length+(i+k)] --> Elements left of i code[i] = postsum[0] -
 * postsum[i] + postsum[code.length + (i + k)]; } } }
 * 
 * return code; }
 * 
 * public static void main(String[] args) { int[] arr = new int[] { 2, 4, 9, 3
 * }; int k = -2;
 * 
 * int[] res = decrypt(arr, k);
 * 
 * for (int x : res) { System.out.print(x + " "); } }
 * 
 */

// brute force approach:

/*
 * public int[] decrypt(int[] code, int k) { int[] h = new int[code.length]; if
 * (k > 0) { for (int i = 0; i < code.length; i++) { int g = i; int sum = 0; for
 * (int j = 1; j <= k; j++) { if (i + j == code.length) { g = 0; } else { g++; }
 * sum += code[g]; } h[i] = sum; } } else if (k == 0){ for (int i = 0; i <
 * code.length; i++) { h[i] = 0; } } else { for (int i = 0; i < code.length;
 * i++) { int g = i; int sum = 0; for (int j = 1; j <= (-1) * k; j++) { if (i -
 * j < 0 && g == 0){ g = code.length - 1; } else { g --; } sum += code[g]; }
 * h[i] = sum; } } return h; }
 */
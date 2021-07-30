package ARRAYS_easy;

public class x36_peak_in_mountain_array {
  public static void main(String[] args) {
    int[] arr = new int[] { 3, 4, 5, 1 };
    System.out.println(peakIndexInMountainArray(arr));
  }

  public static int peakIndexInMountainArray(int[] arr) {
    int l = 0;
    int r = arr.length - 1;
    while (l < r) {
      int mi = l + (r - l) / 2;
      if (arr[mi] < arr[mi + 1])
        l = mi + 1;
      else
        r = mi;
    }
    return l;
  }
}

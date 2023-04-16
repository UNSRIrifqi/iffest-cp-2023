package hmif.babak_penyisihan;

import java.util.Arrays;

public class AnharAhliPemrogramman {

  public static int solution(int arr[], int n) {
    int count = 0;
    Arrays.sort(arr);

    for (int i = n - 1; i >= 0; i--) {
      int left = 0;
      int right = i - 1;

      while (left < right) {
        if (arr[left] + arr[right] == arr[i]) {
          count++;
          left++;
          right--;
        } else if (arr[left] + arr[right] < arr[i]) {
          left++;
        } else {
          right--;
        }
      }
    }

    return count;
  }
}

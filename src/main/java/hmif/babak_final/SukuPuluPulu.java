package hmif.babak_final;

import java.util.Arrays;

public class SukuPuluPulu {
    public static int solution(int arr[]) {
        int num1 = 0, num2 = 0, avg = 0;
        int temp[] = new int[2];
        int round = 1;
        while (arr.length > 1) {
            if (round % 2 == 0) {
                temp = smallestDiff(arr);
            } else {
                temp = largestDiff(arr);
            }

            num1 = temp[0];
            num2 = temp[1];
            avg = Math.round((float) (num1 + num2) / 2);

            int index1 = findIndex(arr, num1);
            int index2 = findIndex(arr, num2);

            arr = replaceElements(arr, index1, index2, avg);

            round++;
        }

        return arr[0];
    }

    public static int[] largestDiff(int arr[]) {
        int result[] = new int[2];

        int largestDiff = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int diff = Math.abs(arr[i] - arr[j]);
                if (diff >= largestDiff) {
                    largestDiff = diff;
                    result[0] = arr[i];
                    result[1] = arr[j];
                }
            }
        }
        return result;
    }

    public static int[] smallestDiff(int[] arr) {
        Arrays.sort(arr);
        int[] result = new int[2];
        int smallestDiff = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int diff = Math.abs(arr[i] - arr[j]);
                if (diff < smallestDiff) {
                    smallestDiff = diff;
                    result[0] = arr[i];
                    result[1] = arr[j];
                }
            }
        }

        return result;
    }

    public static int findIndex(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static int[] replaceElements(int arr[], int index1, int index2, int newValue) {
        int[] newArr = new int[arr.length - 1];

        arr[index1] = newValue;
        arr[index2] = -1;

        Arrays.sort(arr);

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i + 1];
        }

        return newArr;
    }
}

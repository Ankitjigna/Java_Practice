import java.util.*;
public class MergeSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;  // (si+ei)/2
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                // k++;
            } else {
                temp[k] = arr[j];
                j++;
                // k++;
            }
            k++;
        }

// bache hue (left part)
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

// bache hue (Right part)
        while (j <= ei) {
    temp[k++] = arr[j++];
}

// copy temp to original arr
        for (int l = 0; l < temp.length; l++) {
        arr[si + l] = temp[l];
    }

    }

    public static void main(String args[]) {
        int arr[] = {5, 7, 3, 2, 4, 6, 8};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}

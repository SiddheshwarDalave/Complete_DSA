package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge_sort {
    //TC for merging -> O(n)

    //TC for whole operation-> O(nlogn)

    //SC -> O(n)

    //divide and concur
    public void mergeSort(int[] arr,int l,int r){

        if(l>=r){
            return;
        }
        //divide here
        int mid=l+(r-l)/2;
        mergeSort(arr, l,mid);
        mergeSort(arr,mid+1,r);
        //concur here
       merge(arr,l,mid,r);
       // System.out.println(Arrays.toString(ans));
    }
    public void merge(int[] arr, int l, int mid, int r) {

        //concur implementation
        int n = r - l + 1;
        int i = l;
        int j = mid + 1;
        int k = 0;

        int[] answerArray = new int[n];

        while (i <= mid && j <= r) {

            if (arr[i] <= arr[j]) {
                answerArray[k] = arr[i];
                k++;
                i++;
            } else {
                answerArray[k] = arr[j];
                k++;
                j++;
            }

        }
        while (i <= mid) {
            answerArray[k++] = arr[i++];
        }
        while (j <= r) {
            answerArray[k++] = arr[j++];
        }

        for (int a = 0, b = l; a < answerArray.length; a++, b++) {
            arr[b] = answerArray[a];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(answerArray));
    }

}

package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//bubble
        int[] arr = {7, 9, 599, 2, 3, 55, 11, 67};

        Bubble_sort bubble_sort = new Bubble_sort();
        bubble_sort.bubblesort(arr);

        System.out.println(Arrays.toString(arr));
//insertion
        int[] arr2 = {54, 121, 6, 2, 9, 32};

        Insertion_sort insertion_sort = new Insertion_sort();
        insertion_sort.insertSort(arr2);

        System.out.println(Arrays.toString(arr2));
//selection
        int[] arr3 = {34, 23, 75, 2, 9, 3};

        Selection_sort selection_sort = new Selection_sort();
        selection_sort.selectionSort(arr3);
        System.out.println(Arrays.toString(arr3));
//merging 2 arrays
        MergingFunction mergingFunction = new MergingFunction();
        mergingFunction.merge(arr, arr2);

//merge sort
        int[] mer = {5, 4, 3, 2, 1};
        Merge_sort merge_sort = new Merge_sort();
        merge_sort.mergeSort(mer, 0, mer.length - 1);


//Quick sort
        int[] arr4= {5, 8, 1, 3, 6, 7, 2};
        Quick_sort quick_sort = new Quick_sort();
        quick_sort.quickSort(arr4,0,arr4.length-1);
        System.out.println(Arrays.toString(arr4));
    }
}


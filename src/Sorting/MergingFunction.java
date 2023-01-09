package Sorting;

import java.util.Arrays;

public class MergingFunction {

    public void merge(int[] arr1, int[] arr2){

        int n=arr1.length;
        int m=arr2.length;

        int[] answerArray=new int[m+n];

        int i=0,j=0,k=0;

        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                answerArray[k++]=arr1[i++];
            }else{
                answerArray[k++]=arr2[j++];
            }
        }
        while(i<n){
            answerArray[k++]=arr1[i++];
        }
        while(j<m){
            answerArray[k++]=arr2[j++];
        }

        System.out.println(Arrays.toString(answerArray));
    }
}

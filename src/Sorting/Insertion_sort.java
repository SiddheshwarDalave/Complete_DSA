package Sorting;

public class Insertion_sort {
    //compare element & insert at start by swapping

    //for n -> n-1 pass

    //TC -> O(n2) SC-> O(1)

    //stability -> stable -> not disturbing order

    //Adaptive -> adaptive -> for sorted giving less TC (Naturally adaptive)

    //worst case comparision -> n(n-1)/2
    public void insertSort(int[] arr){
        //for 1 pass 1st element get sorted same
        for(int i=1;i<arr.length;i++){

            for(int j=i-1;j>=0;j--){

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }else{
                    break;
                }
            }
        }
    }
}

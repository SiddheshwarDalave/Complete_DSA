package Sorting;

public class Selection_sort {
    // select an index and select the correct element which supposed to be there

    //use -> find the lesser / minimal element ,kth smallest element

    //stability -> unstable

    // Not adaptive

    // TC -> O(n2) SC-> O(1)

    //int[] arr3={34,23,75,2,9,3};
    public void selectionSort(int[] arr){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int minIndex=i;

                for(int j=i+1;j<n;j++){

                    if(arr[j]<arr[minIndex]){
                        minIndex=j;
                    }
                }

                int temp=arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]=temp;
        }
    }

}
//[2, 3, 9, 23, 34, 75]

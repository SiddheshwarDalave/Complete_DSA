package Sorting;

public class Quick_sort {
    //pivot element-> generally keep last element,partitions

    //what we do in quick sort-> put less element to the left of pivot and bigger to the right

    //TC depend upon where partition happen

    //recursive

    public void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pivot=partion(arr,low,high);
//int[] arr4= {5, 8, 1, 3, 6, 7, 2};
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }
    public int partion(int[] arr, int low, int high){
        int pivot=arr[high];
        //taken last element as pivot
//int[] arr4= {5, 8, 1, 3, 6, 7, 2};
        // 1,8,5,3,6,7,2
        //1 ,2,5,3,6,7,8
        int i=low-1;
      //to check how many elements are there less than pivot
        for(int j=low;j<high;j++){

           if(arr[j]<pivot){
               i++;
               //swap
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
           }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;

        return i;
    }
}

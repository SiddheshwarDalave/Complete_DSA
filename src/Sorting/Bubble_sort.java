package Sorting;

public class Bubble_sort {

    public void bubblesort(int[] arr){

        //compare adjuscent and swap

        //for 1st swap we get max element at end/bottom

        //no of comparision-> n(n-1)/2 for n elements

        //use-> Kth largest element

        //TC -> O(n2) and SC-> O(1)


        //[9,4,1,6,3,7]

         for(int i=0;i<arr.length-1;i++){

             for(int j=0;j<arr.length-1-i;j++){

                 if(arr[j]>arr[j+1]){
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                 }
             }
         }
    }
}

//relative ordering same element get disturb means -> Stability -> not stable
//Adaptivenss -> BS is not stable

//adaptive means changing Time complexity  as per input
//we can make it adaptive by adding boolean flag=false;

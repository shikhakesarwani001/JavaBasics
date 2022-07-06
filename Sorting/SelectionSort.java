package Sorting;

public class SelectionSort {
    
    public static void main(String[] args) {
    int arr[]={9,2,1,5,3};
        //SelectionSort
        //Time complexity: O(n^2)
        for(int i=0; i< arr.length; i++){
            int smallest=i;
            for(int j=i+1; j< arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }

        for(int p=0; p<arr.length;p++){
            System.out.print(arr[p]+" ");
        }
    }
}

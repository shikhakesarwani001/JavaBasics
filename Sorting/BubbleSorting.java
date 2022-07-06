package Sorting;

public class BubbleSorting {
    
    public static void main(String[] args) {
        int arr[]={9,2,1,5,3};
        //Bubble Sort
        //Time complexity: O(n^2)
        for(int i=0; i< arr.length-1; i++){ //n-1
            for(int j=0; j<arr.length-i-1; j++){ //n-1 
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int p=0; p<arr.length;p++){
            System.out.print(arr[p]+" ");
        }
        
    }
}

package Sorting;

public class InsertionSort {
    
    public static void main(String[] args) {
        int arr[]={9,2,1,5,3};
            //InsertionSort
            //Time complexity: O(n^2)
            for(int i=1; i<arr.length;i++){
                int current=arr[i];
                int j=i-1;
                while( j>=0 && current <arr[j]){
                    arr[j+1]=arr[j];
                    j--;
                }
                //placement
                arr[j+1]=current;
            }
    
            for(int p=0; p<arr.length;p++){
                System.out.print(arr[p]+" ");
            }
        }
}

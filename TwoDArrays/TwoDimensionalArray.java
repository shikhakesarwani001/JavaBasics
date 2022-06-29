package TwoDArrays;

import java.util.Scanner;
//Input 2 D array from user and print its values
public class TwoDimensionalArray {
    
    public static void main(String Args[]){

        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        int[][] twoDArrays=new int[rows][cols];

        for(int i=0; i<rows; i++){

            for(int j=0; j<cols;j++){
                twoDArrays[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<rows; i++){

            for(int j=0; j<cols;j++){
                System.out.print(twoDArrays[i][j]+" ");
            }
            System.out.println();
        }

    }
}

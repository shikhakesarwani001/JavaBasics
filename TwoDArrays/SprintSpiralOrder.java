package TwoDArrays;

import java.util.Scanner;

public class SprintSpiralOrder {
    //1  5  7  9  10  11
    //6  10 12 13 20  21
    //9  25 29 30 32  41
    //15 55 59 63 68  70
    //40 70 79 81 95  105

    //Output: 1 5 7 9 10 11 21 41 70 105 95 81 79 70 40 15 9 6 10 12 13 20 32 68 63 59 55 25 29 30 29

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int[][] twoDArrays=new int[n][m];

        for(int i=0; i<n; i++){

            for(int j=0; j<m;j++){
                twoDArrays[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Spiral Order matrix is: ");
        int row_start=0;
        int row_end=n-1;
        int col_start=0;
        int col_end=m-1;

        while(row_start<=row_end && col_start<=col_end){

            for(int col=col_start; col<=col_end; col++){
                System.out.print(twoDArrays[row_start][col]+" ");
            }
            row_start++;
            for(int row=row_start; row<=row_end;row++){
                System.out.print(twoDArrays[row][col_end]+" ");
            }
            col_end--;
            for(int col=col_end; col>=col_start; col--){
                System.out.print(twoDArrays[row_end][col]+" ");
            }
            row_end--;
            for(int row=row_end;row>=row_start; row--){
                System.out.print(twoDArrays[row][col_start]+" ");
            }
            col_start++;
        }



    }
}

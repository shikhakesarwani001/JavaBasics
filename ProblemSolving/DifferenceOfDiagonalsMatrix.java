package ProblemSolving;

import java.util.Scanner;

public class DifferenceOfDiagonalsMatrix {
    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);
        int size=in.nextInt();
        int ar[][]=new int[size][size];
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                ar[i][j]=in.nextInt();
            }
        }
        int sumDiagonal1=0, sumDiagonal2=0;
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(i==j){
                    sumDiagonal1+=ar[i][j];
                }
                if(j== size-1-i)
                {
                    sumDiagonal2+=ar[i][j];
                }
            }
        }

        System.out.println(Math.abs(sumDiagonal1-sumDiagonal2));
    }
}

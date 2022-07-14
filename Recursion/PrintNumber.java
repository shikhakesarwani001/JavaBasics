package Recursion;

public class PrintNumber {
    //print number from 1 to 5 using recursion

    public static void PrintNumber(int n){

        if(n==6){
            return;
        }
        System.out.println(n);
        PrintNumber(n+1);
    }
    public static void main(String[] args) {
        
        int n=1;
        PrintNumber(n);
    }
}

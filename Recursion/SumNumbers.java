package Recursion;

//print the sum of n numbers where n=5
public class SumNumbers {

    public static void PrintSum(int n, int sum){
        
        if(n==5){
            sum=sum+n;
            System.out.println(sum);
            return;
        }
        sum=sum +n;
        
        PrintSum(n+1, sum);

    }

    public static void main(String[] args) {
        
        int n=1;
        int sum=0;
        PrintSum(n, sum);
    }
    
}

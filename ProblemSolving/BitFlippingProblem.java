package ProblemSolving;
// You will be given a list of 32 bit unsigned integers. Flip all the bits (1->0 and 0->1) and return the result as an unsigned integer.

import java.util.Scanner;

// Example
// n=9(10)
// 9(10)=1001(2). We're working with 32 bits, so:
// 000000000000000000000000000001001 = 9(10)
// 111111111111111111111111111110110 = 4294967286(10)
// Return 4294967286.

// The first line of the input contains q, the number of queries.
// Each of the next q lines contain an integer, n, to process.
// Sample Input
// 3 
// 2147483647 
// 1 
// 0
// Sample Output
// 2147483648 
// 4294967294 
// 4294967295
// Explanation

// Take 1 for example, as unsigned 32-bits is 00000000000000000000000000000001 and doing the flipping we get 11111111111111111111111111111110 which in turn is 4294967294.

public class BitFlippingProblem {
    
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);
        int numberOfInput=in.nextInt();
        long max=Integer.MAX_VALUE;
        max=max*2+1;
        for(int i=0; i< numberOfInput; i++){
            System.out.println(~in.nextLong() & max);
        }
        
    }
}

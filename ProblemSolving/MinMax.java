// Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

// Example

// The minimum sum is  and the maximum sum is . The function prints

// 16 24
// Function Description

// Complete the miniMaxSum function in the editor below.

// miniMaxSum has the following parameter(s):

// arr: an array of  integers
// Print

// Print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.

// Input Format

// A single line of five space-separated integers.

// Constraints
//

// Output Format

// Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)

// Sample Input

// 1 2 3 4 5
// Sample Output

// 10 14
//
package ProblemSolving;
//
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    
    //if array input is sorted minSum  should start from 1st element and maxSum should start from last element
    // int minSum=0, maxSum=0, count=0;
    // int size=arr.size();
    // for(int i=0, j=size-1; count<4;i++){
    //     minSum=minSum+arr.get(i);
    //     //System.out.println(arr.get(j)+" "+maxSum);
    //     maxSum=maxSum+arr.get(j);
    //     j--;
    //     count++;
    // }
    // System.out.print(minSum+" "+maxSum);
    
    //When not sorted
    // int sum=0, min=arr.get(0), max=arr.get(0);
    // for(int i=0; i<arr.size(); i++){
    //     sum=sum+arr.get(i);
    //     if(min>arr.get(i)){
    //         min=arr.get(i);
    //     }
    //     if(max<arr.get(i)){
    //         max=arr.get(i);
    //     }
    // }
    // System.out.print((sum-max)+" "+(sum-min));
    
    // }
    //best solution
     Collections.sort(arr);
        
        long max = (long)arr.get(4)+arr.get(3)+arr.get(2)+arr.get(1);
        long min = arr.get(0)+arr.get(1)+arr.get(2)+(long)arr.get(3);
        
        System.out.println(min+" "+max);
    }
}

public class MinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

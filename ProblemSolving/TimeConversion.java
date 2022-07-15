// Given a time in -hour AM/PM format, convert it to military (24-hour) time.

// Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
// - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

// Example
// s='12:01:00PM'

// Return '12:01:00'.
// s='12:01:00AM'

// Return '00:01:00'.

// Function Description

// Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

// timeConversion has the following parameter(s):

// string s: a time in  hour format
// Returns

// string: the time in  hour format
// Input Format

// A single string  that represents a time in -hour clock format (i.e.:  or ).

// Constraints

// All input times are valid
// Sample Input

// 07:05:45PM
// Sample Output

// 19:05:45
package ProblemSolving;

import java.io.*;



class TimeConversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    String str[]=s.split(":");
    StringBuilder res=new StringBuilder();
    if(str[2].contains("AM")){
        if(str[0].contains("12")){
            res=res.append("00"+":"+str[1]+":"+str[2].substring(0,2));
        }
        else{
           res=res.append(str[0]+":"+str[1]+":"+str[2].substring(0,2)); 
        }
        
    }
    else{
        if(str[0].contains("12")){
            res=res.append(str[0]+":"+str[1]+":"+str[2].substring(0,2));
        }
        else{
            int temp=Integer.parseInt(str[0])+12;
        res=res.append(temp+":"+str[1]+":"+str[2].substring(0,2));
        }
        
    }
    return res.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       
        String s = bufferedReader.readLine();

        String result = timeConversion(s);
        System.out.println(result);
        
        bufferedReader.close();
        
        
    }
}


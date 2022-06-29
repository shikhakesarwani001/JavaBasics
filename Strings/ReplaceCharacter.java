package Strings;

import java.util.Scanner;

public class ReplaceCharacter {
    //Input a string from user. Create a new string called 'result' in which all charater 'e' in original string will be replaced by character 'i' in 'result'.
    // Original ="eabcdef"; result="iabcdif"
    //Original = "xyz"; result = "xyz"
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String original=sc.nextLine();

        String result="";
        for(int i=0; i< original.length(); i++){
            if(original.charAt(i)=='e'){
                result=result+'i';
            }
            else{
                result=result+original.charAt(i);
            }
            
        }
        System.out.println(result);
    }
}

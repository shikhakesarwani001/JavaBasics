package Strings;

import java.util.Scanner;

//Reverse a given string 
// StringInput="Shikha"  OutputString= "ahkihS"
public class ReverseString {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        
        char[] charString=input.toCharArray();
        for(int i=0,y=input.length()-1; i<input.length()/2; i++, y--){
             char temp=charString[i];
             charString[i]=charString[y];
             charString[y]=temp;
        }
        System.out.println(new String(charString));
    }

    
}

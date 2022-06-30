package Strings;

import java.util.Scanner;

public class CountVowelsString {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        int count=0;
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
              case 'A':
              case 'a':
              case 'E':
              case 'e':
              case 'I':
              case 'i':
              case 'O':
              case 'o':
              case 'U':
              case 'u':
              count++;
            }

        }
        System.out.println(count);
    }
}

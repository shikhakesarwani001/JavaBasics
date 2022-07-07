package Strings;

import java.util.HashMap;
import java.util.Scanner;

public class MaxOccuringCharacter {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();

        HashMap<Character,Integer> map=new HashMap<Character, Integer>();
        
        char[] charArr=str.toCharArray();
        char KeyWithMaxFreq=0;
        int max=1;
        for (char c : charArr) {
            if(map.containsKey(c)){
                int temp= map.get(c);
                map.put(c, temp++);
                if(max<temp){
                    max=temp;
                    KeyWithMaxFreq=c;
                }
            }
            else{
                map.put(c, 1);
            }
        }
        System.out.println(KeyWithMaxFreq);
        System.out.println(max);
    }
}

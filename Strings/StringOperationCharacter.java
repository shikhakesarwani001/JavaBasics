package Strings;

import java.util.Scanner;

public class StringOperationCharacter {
    //Input email from user and form the username for that , remove @ and remaining part
    // email : shikhakes@gmail.com username : shikhakes
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String email=sc.next();

        String userName="";
        for(int i=0; i < email.length(); i++){
         if(email.charAt(i)== '@')
         {
          userName+=email.charAt(i-1);
          break;
         }
         else{
            userName+=email.charAt(i);
         }
        }
System.out.println(userName);
    }
}

package Strings;

import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

public class ArrayOfStrings {
  //Take an array of strings input from user and find the total length
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    int size= sc.nextInt();

    String[] stringArr=new String[size];
    System.out.println("Enter strings");
    int count=0;
    for(int i=0; i<size; i++){
     
     stringArr[i]=sc.next();
     count=count+stringArr[i].length();
    }

    System.out.println(count);
  }  
}

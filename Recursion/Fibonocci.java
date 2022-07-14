package Recursion;

public class Fibonocci {
    
    public static void PrintFibo(int a, int b, int n)
    {
        if(n<=2){
            return;
        }
        int c=a+b;
        System.out.println(c);
        PrintFibo(b, c, n-1);
    }

    public static void main(String[] args) {
        
        int n=6;// 6 fibonocci number -> 0 1 1 2 3 5
        int first=0;
        int second=1;
        System.out.println(first);
        System.out.println(second);
        PrintFibo(first, second, n);
    }
}


public class MyClass {
    public static void main(String args[]) {
      //12344321
      //123**321
      //12****21
      //1****1
      for(int i=4; i>0;i--){
          int j;
          for(j=1; j<=i;j++){
              System.out.print(j);
          }
          for(int s=4;s>i;s--){
              System.out.print("*");
              System.out.print("*");
          }
          for(int t=j-1; t>=1;t--){
              System.out.print(t);
          }
          System.out.println();
      }
    }
}
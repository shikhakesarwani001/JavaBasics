public class Starpattern {
    //   *
    //  ***
    // *****
    //*******
    public static void main(String args[]) {
      
        for(int i=1; i<=4;i++){
            
           for(int s=4; s>=i; s--){
            System.out.print(" ");
          }
          for(int t=1;t<=i;t++){
              System.out.print("*");
          }
          for(int sp=2;sp<=i;sp++)
          {
              System.out.print("*");
          }
          System.out.println();
        }
      }
}

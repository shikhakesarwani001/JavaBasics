package PrintPattern;

public class RhombusPattern {
    //    * * * * *
    //   * * * * *
    //  * * * * *
    // * * * * *
    //* * * * *
    public static void main(String args[]){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int s=4;s>=i;s--){
                System.out.print(" ");

            }
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

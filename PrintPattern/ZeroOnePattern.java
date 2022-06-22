public class ZeroOnePattern {
    //1
    //0 1
    //1 0 1
    //0 1 0 1
    //1 0 1 0 1
    public static void main(String args[]){
        int n=5;
        int element=1;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                
                System.out.print(element+" ");
                element=1-element;
            }
            System.out.println();
        }
    }
}

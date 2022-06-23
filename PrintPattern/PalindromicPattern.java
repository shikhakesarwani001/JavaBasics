public class PalindromicPattern{
    //        1
    //      2 1 2
    //    3 2 1 2 3
    //  4 3 2 1 2 3 4
    //5 4 3 2 1 2 3 4 5
    public static void main(String args[]){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int s=1;s<=n-i;s++){
                System.out.print("  ");
            }
            int element1=i;
            for(int j=1; j<=i;j++){
                
                System.out.print(element1+" ");
                element1--;
            }
            int element =2;
            for(int k=1;k<i;k++){
                
                System.out.print(element+" ");
                element++;
            }
            System.out.println();
        }
    }
}
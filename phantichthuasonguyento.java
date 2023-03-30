import java.util.*;
public class phantichthuasonguyento {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        int j=1;
        while(t-->0){
            int n=sc.nextInt();
            System.out.print("Test "+j+": ");
            j++;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                int dem=0;
                while(n%i==0){
                    dem++;
                    n/=i;
                }
               System.out.print(i+"("+dem+")"+" ");
                        }
            }if(n>1){
                System.out.print(n+"(1)");
            }
            System.out.println();
        }
    }
}


import java.util.Scanner;

public class sotamphan {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int ok=0;
            while(n>0){
                int x=n%10;
                if(x!=0 && x!=1 &&x!=2){
                    ok=1;
                }n/=10;
            }if (ok==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}

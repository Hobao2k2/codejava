import java.util.*;
public class uocsonguyentolonnhat {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        while(t-->0){
            long x=0;
            long n=sc.nextLong();
            for(long i=2;i<=Math.sqrt(n);i++){
                while(n%i==0){
                    n/=i;
                    x=i;
                }
            }if(n>1){
                x=n;
            }
            System.out.println(x);
        }
    }
}

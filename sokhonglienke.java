import java.util.*;
public class sokhonglienke {
    static Scanner sc = new Scanner(System.in);
    static boolean tong(long n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }if(sum%10==0) return true;
        else return false;
    }
    static boolean kt(long n){
        long x=n%10;
        n/=10;
        while(n>9){
            long y=n%10;
            if(Math.abs(x-y)!=2) return false;
            x=y;
            n/=10;
            
        }return true;
    }
    public static void main(String[] args) {
    int t=sc.nextInt();
    while(t-->0){
    long n=sc.nextLong();
    if(tong(n) && kt(n)){
        System.out.println("YES");
    }else System.out.println("NO");
    
}
}
}

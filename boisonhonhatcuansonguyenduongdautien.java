import java.util.Scanner;
public class boisonhonhatcuansonguyenduongdautien {
    static Scanner in = new Scanner(System.in);
    static long gcd(long a, long b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    static long lcm(long a, long b){
        return a * b / gcd(a, b);
    }
    public static void main(String[] args) {
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            long x = 1;
            for(int i = 2; i <= n; i++){
                x = lcm(x, i);
            }
            System.out.println(x);
        }
    }
}

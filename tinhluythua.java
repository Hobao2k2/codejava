import java.util.Scanner;

public class tinhluythua {
	static Scanner in = new Scanner(System.in);
	static final long mod = 1000000007;
	static long gcd(int a, long b) {
		if(b == 0L) return 1;
		long tmp = gcd(a, b/2) % mod;
		if(b % 2 == 0L) return tmp * tmp % mod;
		else return (a * tmp % mod) * tmp % mod;
	}
	public static void main(String[] args) {
		int a;
		long b;
		while(true) {
			a = in.nextInt();
			b = in.nextLong();
			if(a == 0 && b == 0L) break;
			System.out.println(gcd(a, b));
		}
	}
}

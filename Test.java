package codejava;
import java.math.BigInteger;
import java.util.Scanner;

public class Test{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = Integer.parseInt(scan.nextLine());
		while (t-- > 0) {
			BigInteger a = scan.nextBigInteger();
			BigInteger b = scan.nextBigInteger();
			BigInteger zero = new BigInteger("0");
			BigInteger x=a;
			BigInteger y=b;
			BigInteger tmp;
			while (b.equals(zero) == false) {
				tmp = a.mod(b);
				a = b;
				b = tmp;
			}
			BigInteger kq=x.multiply(y);
			BigInteger boi=kq.divide(a);
			System.out.println(boi);
		}
	}

}

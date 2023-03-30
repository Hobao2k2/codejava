import java.util.Scanner;
import java.lang.Math;
public class SoNguyenTo {
	static Scanner in = new Scanner(System.in);
	static boolean ngto(int n) {
		if(n < 2) return false;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int t, n;
		t = in.nextInt();
		while(t > 0) {
			n = in.nextInt();
			if(ngto(n)) System.out.println("YES");
			else System.out.println("NO");
			t--;
		}

	}

}

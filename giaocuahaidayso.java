import java.util.Scanner;
import java.util.Arrays;
public class giaocuahaidayso {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int n = in.nextInt();
		int m = in.nextInt();
		int a[] = new int[1005];
		for(int i = 0; i < n; i++) {
			int x = in.nextInt();
			a[x] = 1;
		}
		int cnt = 0;
		int b[] = new int[m];
		for(int i = 0; i < m; i++) {
			b[i] = in.nextInt();
		}
		int c[] = Arrays.copyOf(b, b.length);
		Arrays.sort(c);
		for(int i = 0; i < m; i++) {
			if(a[c[i]] == 1) {
				System.out.print(c[i] + " ");
				a[c[i]] = 0;
			}
		}
	}

}

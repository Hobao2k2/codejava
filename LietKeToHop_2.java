import java.util.Scanner;
public class LietKeToHop_2 {
	static Scanner in = new Scanner(System.in);
	static int n, k, a[] = new int[15], cnt = 0;
	static void Try(int i) {
		for(int j = a[i-1] + 1; j <= n - k + i; j++) {
			a[i] = j;
			if(i == k) {
				for(int d = 1; d <= k; d++) System.out.print(a[d]);
				System.out.print(" ");
				cnt++;
			}
			else Try(i+1);
		}
	}
	public static void main(String[] args) {
		n = in.nextInt();
		k = in.nextInt();
		Try(1);
		System.out.println("\nTong cong co " + cnt + " to hop");
	}

}

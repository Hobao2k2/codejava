import java.util.Scanner;
public class Tonggiaithua {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		Long a[] = new Long[25];
		int n = in.nextInt();
		a[1] = 1L;
		for(int i = 2; i <= n; i++) {
			a[i] = a[i-1] * i;
		}
		Long tonggt = 0L;
		for(int i = 1; i <= n; i++) tonggt += a[i];
		System.out.println(tonggt);
	}

}

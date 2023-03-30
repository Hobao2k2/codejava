import java.util.Scanner;
public class sapxepchon {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int n = in.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) a[i] = in.nextInt();
		for(int i = 0; i < n - 1; i++) {
			int id = i;
			for(int j = i + 1; j < n; j++) {
				if(a[id] > a[j]) id = j;
			}
			int tmp = a[i];
			a[i] = a[id];
			a[id] = tmp;
			System.out.print("Buoc " + (i + 1) + ": ");
			for(int j = 0; j < n; j++) System.out.print(a[j] + " ");
			System.out.println();
		}
	}
}

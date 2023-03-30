import java.util.Scanner;
public class boisochung_uocsochung {
	static Scanner in = new Scanner(System.in);
	static int USCLN(int a, int b) {
		if(b==0){
                    return a;
                }else return USCLN(b,a%b);
	}
	public static void main(String[] args) {
		int t = in.nextInt();
		int a, b;
		while(t > 0) {
			a = in.nextInt();
			b = in.nextInt();
			int n = USCLN(a, b);
			System.out.println((long)a * b / n + " " + n);
			t--;
		}
	}

}

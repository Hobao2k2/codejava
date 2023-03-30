
package codejava;
import java.util.*;
public class diemcanbang {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[]a=new int[n+1];
            for(int i = 1; i <= n; i++) {
				int x = sc.nextInt();
				a[i] = a[i-1] + x;
			}
			boolean ok = false;
			for(int i = 1; i <= n; i++) {
				if(a[i-1] == a[n] - a[i]) {
					ok = true;
					System.out.println(i);
					break;
				}
			}
			if(!ok) System.out.println(-1);
            }
        }
    }

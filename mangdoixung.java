import java.util.*;
public class mangdoixung {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
    int t=sc.nextInt();
    while(t-->0){
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++) a[i]=sc.nextInt();
    int i=0;
    int d=a.length - 1;
    int ok=0;
    while(i<=d){
        if(a[i]!=a[d]){
            ok=1;
        }i++;d--;
    }if(ok==0) System.out.println("YES");
    else System.out.println("NO");
       }
    }
}

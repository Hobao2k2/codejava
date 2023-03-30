import java.util.*;
public class uocsochiahetcho2 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n%2!=0){
		System.out.println("0");
		}
	    else{
		int dem=1;
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
			if(i%2==0) dem++;
			if(i!=(n/i)&&(n/i)%2==0) dem++;
				}
			}
			System.out.println(dem);
		}
        }
    }
}

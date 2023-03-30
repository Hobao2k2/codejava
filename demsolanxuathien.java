package codejava;
import java.util.*;
public class demsolanxuathien {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int x=1;
        while(x<=t){
            int[]b=new int[100];
            int n=sc.nextInt();
            int[]a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }System.out.println("Test "+x+":");
            x++;
            for(int i=0;i<n;i++){
                if(b[i]==0){
                    b[i]=1;
                for(int j=i+1;j<n;j++){
                    if(a[i]==a[j]){
                        b[i]++;
                        b[j]=-1;
                    }
                }
                }
            } 
           
            for(int i=0;i<n;i++){
                if(b[i]>=1){
                    System.out.println(a[i]+" xuat hien "+b[i]+" lan");
                }
            }
        }
    }
}


package codejava;
import java.util.*;
public class matrannhiphan {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]a=new int[n][3];
        int dem=0;
        for(int i=0;i<n;i++){
            int dem1=0,dem2=0;
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
                if(a[i][j]==1) dem1++;
                else dem2++;
            }if(dem1>dem2) dem++;
        }System.out.println(dem);
    }
}

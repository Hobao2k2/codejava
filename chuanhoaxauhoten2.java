
package codejava;
import java.util.*;
public class chuanhoaxauhoten2 {
     static String xuly(String s){
        String s3=s.substring(0,1).toUpperCase()+s.substring(1, s.length()).toLowerCase();
        return s3;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String n=sc.nextLine();
        while(t-->0){
            String t1=sc.nextLine();
             StringTokenizer stringTokenizer3 = new StringTokenizer(t1, " ", false);
             StringTokenizer stringTokenizer4 = new StringTokenizer(t1, " ", false);
             stringTokenizer3.nextToken();
        while (stringTokenizer3.hasMoreTokens()) {
            if(stringTokenizer3.countTokens()==1){
                System.out.print(xuly(stringTokenizer3.nextToken())+", ");
            }
            else System.out.print(xuly(stringTokenizer3.nextToken())+" ");
                
        }System.out.print((xuly(stringTokenizer4.nextToken())).toUpperCase());
        System.out.println();
	}
    }
}

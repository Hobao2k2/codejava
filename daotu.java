
package codejava;
import java.util.*;
public class daotu {
    static String xuly(String s){
        StringBuilder s1=new StringBuilder(s);
        return s1.reverse().toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String ig=sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            StringTokenizer tk=new StringTokenizer(s," ",false);
            while(tk.hasMoreElements()){
                System.out.print(xuly(tk.nextToken())+" ");
            }System.out.println();
        }
    }
}


package codejava;
import java.util.*;
public class sodep_1 {
    static boolean kt1(String s){
        StringBuilder s1=new StringBuilder(s);
        StringBuilder s2=s1.reverse();
        if(s1.equals(s2)){
            return true;
        }else{
            return false;
        }
    }
    static boolean kt2(String s){
        for(int i=0;i<s.length();i++){
            if(Integer.parseInt(String.valueOf(s.charAt(i)))%2==1){
            return false;
        }
        }return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String n=sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            if(kt1(s)&&kt2(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}

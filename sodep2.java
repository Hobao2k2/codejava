
package codejava;
import java.util.*;
public class sodep2 {
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
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        if(sum%10==0) return true;
        else return false;
    }
    static boolean kt3(String s){
        if(s.charAt(0)=='8'&&s.charAt(s.length()-1)=='8') return true;
        else return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String n=sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            if(kt1(s)&&kt2(s)&&kt3(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}

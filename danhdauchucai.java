
package codejava;
import java.util.*;
public class danhdauchucai {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Set<String> se=new HashSet<String>();
        for(int i=0;i<s.length();i++){
            se.add(s.substring(i,i+1));
        }System.out.println(se.size());
    }
}

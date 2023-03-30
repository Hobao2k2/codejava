
package codejava;
import java.util.*;
import java.io.*;
public class vd1 {
      static String xuli(String s){
        String[] ss=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<ss.length;i++){
            sb.append(ss[i].substring(0,1).toUpperCase());
            sb.append(ss[i].substring(1,ss[i].length()).toLowerCase()+" ");
        }return String.valueOf(sb);
    }
    public static void main(String[] args) {
        System.out.println("bao nam");
    }
}

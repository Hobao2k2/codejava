
package codejava;

import java.util.*;
public class ThuGonDaySo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> ar=new ArrayList<Integer>();
        int t=sc.nextInt();
        int i=1;
        while(i<=t){
            ar.add(sc.nextInt());
            i++;
        }int j = 0;
        while(j < ar.size() - 1){
            if((ar.get(j) + ar.get(j+1)) % 2 == 0){
                ar.remove(j);
                ar.remove(j);
                if(j > 0) j--;
                continue;
            }
            j++;
        }
        System.out.println(ar.size());
    }
}

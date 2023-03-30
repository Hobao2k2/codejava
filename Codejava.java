import java.util.Scanner;
public class Codejava {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
       while(a>0){
           int b=sc.nextInt();
           System.out.println((long)b*(b+1)/2);
           a-=1;
       }
    }
    
}
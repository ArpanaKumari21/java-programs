import java.util.*;
public class Fibonacci{
    public static void main(String[] args){
        int a=0;
        int b=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        while(i<=n){
            int temp=b;
            b=a+b;
            a=temp;
            i++;
             System.out.println(b);
        }
        System.out.println(b);
    }
}
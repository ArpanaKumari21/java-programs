import java.util.*;
public class palindrom{
    static void rev(int n){
        int sum=0;
        int copy=n;
        while(copy!=0){
        int last=copy%10;
        sum=sum*10+last;
        copy=copy/10;
        }
        if(sum==n){
            System.out.println("palindrom");
        }else{
            System.out.println("not palindrom");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    rev(n);
}}
import java.util.*;
public class ntoone{
    public static void func(int i,int n){
        if(i<1){
            return;
        }else{
            System.out.println(i);
            func(i-1,n);
        }
    }
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        func(n,n);
    }

}
import java.util.*;
public class backoneton{
    public static void func(int i,int n){
        if(i<1){
            return;
        }else{
            func(i-1,n);
            System.out.println(i);
        }
    }
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        func(n,n);
    }

}
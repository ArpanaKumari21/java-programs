import java.util.*;
public class sum{
    public static void func(int i,int sum){
        if(i<1){
             System.out.println(sum);
            return;
        }else{
            func(i-1,sum+i);
        }
    }
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        func(n,0);
    }

}
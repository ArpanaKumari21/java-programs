public class sum2{
    public static int func(int n){
        if(n==0){
            return 0;
        }else{
            return (n+func(n-1));
        }
    } 
    public static void main(String[]arg){
        System.out.println(func(4));
    }
}
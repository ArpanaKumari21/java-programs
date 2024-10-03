public class mult{
    public static int func(int n){
        if(n==1){
            return 1;
        }else{
            return(n*func(n-1));
        }
    }
    public static void main(String[]arg){
        System.out.println(func(5));
    }
}
public class reverse{
    int rev(int n){
        int sum=0;
        while(n!=0){
        int last=n%10;
        sum=sum*10+last;
        n=n/10;
        }
        return sum;
    }
    public static void main(String[] args){
        reverse obj=new reverse();
    System.out.println(obj.rev(-542));
}}
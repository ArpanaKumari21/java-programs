public class Armstrong{
    public static void main(String[] arg){
          for(int i=100;i<1000;i++){if(armstrong(i)){
            System.out.print(i+" ");
          }}}
    static boolean armstrong(int i){
           int temp=i;
            int sum=0;
            while(i>0){
            int rem=i%10;
            sum=sum+(rem*rem*rem);
            i=i/10;
        }
       return sum==temp;
    }
}
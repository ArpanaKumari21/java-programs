import java.util.*;
public class Occurance{
    public static void main(String args[]){
        //find the occurance of 7 in a number
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        while(n>0){
            int rem=n%10;
            if(rem==7){
                i++;
            }
            n=n/10;
        }
        System.out.println(i);
    }
}
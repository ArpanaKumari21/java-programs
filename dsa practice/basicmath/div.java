import java.lang.Math;
public class div{
public static void main(String[] args){
     int sum=0;
        for(int i=1;i<=3;i++){
            for(int j=1;j<=Math.sqrt(i);j++){
            if(i%j==0){
                sum=sum+j;
                if((i/j)!=j){
                    sum=sum+j;
                }
                }
            }
            System.out.println(sum);
        }
        
}}
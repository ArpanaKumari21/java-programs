import java.util.*;
class Loops{
    public static void main(String args[]){
        //for loop
        for(int num=1;num<=5;num+=1){
            System.out.print(num+" ");
        }
        //while loop
        int num=1;
        while(num<=5){
            System.out.print(num+" ");
            num+=1;
        }
        //do while loop
        do{
            System.out.println(num);
            num++;
        }while(num<10);
        //find the largest num
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int max=a;
        if(b>max){
                max=b;
            }
            if(c>max){
                max=c;
            }
            System.out.println(max);
            //without using third variable
            max=0;
            if(b>a){
                max=b;
            }else{
                max=a;
            }if(c>max){
                max=c;
            }
            System.out.println(max);
            max=Math.max(c,Math.max(a,b));
            System.out.println(max);
    }
}
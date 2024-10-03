public class Overloading{
    public static void main(String[] args){
        fun(1);
        fun("arpana");
        fun(1,2);
    }
    public static void fun(int a){
        System.out.println(a);
    }
    public static void fun(int a,int b){
        System.out.println(a+" "+b);
    }
    public static void fun(String a){
        System.out.println(a);
    }
}
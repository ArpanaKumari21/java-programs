class rec{
    public static int rec(int n,int x){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
            int y=rec(n-1,x);
            int mult=x*y;
        return mult;
    }
    public static void main(String[]args){
        int a=rec(4,2);
        System.out.println(a);
    }
}
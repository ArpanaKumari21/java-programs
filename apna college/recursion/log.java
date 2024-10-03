class log{
    public static int height(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return height(x,n/2)*height(x,n/2);
        }else{
        return height(x,n/2)*height(x,n/2)*x;
    }}
    public static void main(String[] args){
       int a= height(2,5);
       System.out.println(a);
    }
}
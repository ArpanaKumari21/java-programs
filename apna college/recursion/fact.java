class fact{
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }else{
            int multn_1=factorial(n-1);
            int multn=n*multn_1;
            return multn;
        }
    }
    public static void main(String[]args){
        int ans=factorial(5);
        System.out.println(ans);

    }
}
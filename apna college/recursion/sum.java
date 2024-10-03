class sum{
    public static void s(int i,int n,int sum){
        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            return;
        }else{
            sum=sum+i;
            s(i+1,n,sum);
            System.out.println(i);
        }
    }
    public static void main(String[]args){
        s(1,5,0);
    }
}
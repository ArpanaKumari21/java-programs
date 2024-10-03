class tower{
    public static void tow(int n,String src,String help,String dest){
        if(n==1){
            System.out.println("transfer "+src+" to "+dest);
            return;
        }
        tow(n-1,src,dest,help);
        System.out.println("transfer "+src+" to "+dest);
        tow(n-1,help,src,dest);

    }
    public static void main(String[]args){
        int n=3;
        tow(n,"s","h","d");
    }
}
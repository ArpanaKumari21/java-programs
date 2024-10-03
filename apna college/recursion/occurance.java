class occurance{
    public static int first=-1;
    public static int last=-1;
    public static void findoccurance(String str,int ind,char element){
        int current=str.charAt(ind);
        if(ind==str.length()-1){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(current==element){
            if(first==-1){
                first=ind;
            }else{
                last=ind;
            }
        }
        findoccurance(str,ind+1,element);
    }
    public static void main(String[] args){
        String str="abaacdaefaah";
        char element='a';
        findoccurance(str,0,element);
    }
}
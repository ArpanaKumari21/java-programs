class rev{
    public static void reverse(String a,int ind){
        if(ind==0){
        System.out.println(a.charAt(ind));
        return;
        }
        System.out.print(a.charAt(ind));
        reverse(a,ind-1);
    }
    public static void main(String[] args){
    String a="arpana";
    reverse(a,(a.length()-1));
    }
}
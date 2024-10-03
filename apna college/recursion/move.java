class move{
public static void moveall(int ind,String str,int count,String newstring){
    char current=str.charAt(ind);
    if(ind==str.length()-1){
        newstring+=current;
        for(int i=0;i<count;i++){
        newstring+='x';
    }
        System.out.println(newstring);
        return;
    }
    if(current=='x'){
        count++;
        moveall(ind+1,str,count,newstring);
    }else{
        newstring+=current;
        moveall(ind+1,str,count,newstring);
    }
    }
    public static void main(String[]args){
        String str="axbcxxd";
        String newstring="";
        moveall(0,str,0,newstring);
    }
}
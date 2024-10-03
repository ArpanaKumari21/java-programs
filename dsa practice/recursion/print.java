public class print{
     public static void func (int i,int n){
            if(i>n){
                return;
            }
            System.out.println("arpana");
            func(i+1,n);
        }
    public static void main(String[]arg){
        func(1,5);
    }
}
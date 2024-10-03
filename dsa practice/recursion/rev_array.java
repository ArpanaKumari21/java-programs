public class rev_array{
    public static void func(int i,int array[]){
        if(i>=array.length/2){
            System.out.println(array);
            return;
        }else{
         int a=i;
         array[i]=array[array.length-i-1];
         array[array.length-a-1]=array[a];
        func(i+1,array);
        }
    }
    public static void main(String[] arg){
        int[] arr=new int[]{1,2,3,9,4};
        func(0,arr);
    }
}
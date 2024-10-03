import java.util.*;
public class Input{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");    }
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.print(Arrays.toString(arr));
        arr[1]=13;
         System.out.print(Arrays.toString(arr));
}
}
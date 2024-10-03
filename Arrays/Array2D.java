import java.util.*;
public class Array2D{
    public static void main(String[] args){
        int[][] arr=new int[3][3];
        int[][] arr2={
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };
        System.out.println(Arrays.toString(arr2[1]));
        System.out.println(arr2[1][1]);
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
             System.out.println();
        }
        for(int[] i:arr){
            System.out.println(Arrays.toString(i));
        }
        }
}
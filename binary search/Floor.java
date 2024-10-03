import java.util.*;
public class Floor{
    public static void main(String[] args){
        int[] arr={2,3,5,9,14,16,18};
        System.out.println(floor(arr,15));
    }
    public static int floor(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        if(target<arr[0]){
            return -1;
        }
        while(start<=end){
            int mid=Math.round((start+end)/2);
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                start=start+1;
            }
            if(arr[mid]>target){
                end=end-1;
            }
        }return end;
    }
}
import java.util.*;
public class binary{
    public static void main(String[] args){
        int[] arr={2,4,6,9,11,12,14,20,36,48};
        int target=36;
        System.out.println(binarysearch(arr,target));
    }
    public static int binarysearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean asc=arr[start]<arr[end];
        while(start<=end){
        int mid=Math.round((start+end)/2);
        if(target==arr[mid]){
            return mid;
        }
        if(asc){
        if(target>arr[mid]){
            start=mid+1;
        }
        if(target<arr[mid]){
            end=mid-1;
        }}
        else{
           if(target>arr[mid]){
            end=mid-1;
        }
        if(target<arr[mid]){
            start=mid+1;
        }  
        }}return -1;
    }
}
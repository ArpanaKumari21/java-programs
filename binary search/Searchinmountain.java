public class Searchinmountain{
    public static void main(String[] args){
         int[] arr={1,2,3,4,5,3,1};
         int target=4;
         System.out.println(search(arr,target));
    }
    public static int search(int[] arr,int target){
        int peak=SearchIndexInMountainArray(arr);
         int firstTry=binarysearch(arr,target,0,peak);
         if(firstTry!=-1){
            return firstTry;
         }
         return binarysearch(arr,target,peak+1,arr.length-1);
    }
     public static int SearchIndexInMountainArray(int[] arr) {
         int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > arr[mid+1]) {
                e= mid;
            } else {
                 s = mid + 1; 
                 }
        }return s;
    }
    public static int binarysearch(int[] arr,int target,int start,int end){
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
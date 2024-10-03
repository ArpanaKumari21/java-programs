public class RBS{
    public static void main(String[] args){
        int []arr={3,4,5,6,1,2};
        int target=2;
        System.out.println(search(arr,target));
        System.out.println(findPivot(arr));
    }
    public static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid==arr[mid+1]]){
                
            }
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }if(arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
        }}return -1;
    }
    public static int search(int[] arr,int target){
        int pivot=findPivot(arr);
        if(pivot==-1){
            return binarysearch(arr,target,0,arr.length-1);
        }else{
        int search=binarysearch(arr,target,0,pivot);
        if(search!=-1){
            return search;
        }else return binarysearch(arr,target,pivot+1,arr.length-1);}
    }
    public static int binarysearch(int[]arr,int target,int start,int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(target==arr[mid]){
                return mid;
            }if(target<arr[mid]){
                end=mid-1;
            }if(target>arr[mid]){
                start=mid+1;
            }
        }return -1;
    }
}
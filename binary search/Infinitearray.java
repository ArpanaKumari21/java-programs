public class Infinitearray{
    public static void main(String[] args){
        int[] arr={1,2,3,4,6,6,6,7,8,9};
        int target=6;
        System.out.println(search(arr,target));
    }
    public static int search(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        while(start<=end){
            int mid=(start+end)/2;
            if(target<arr[mid]){
                end=mid-1;
            } if(target>arr[mid]){
                start=mid+1;
            }else{
            return mid;
            }
        }return -1;
    }
}
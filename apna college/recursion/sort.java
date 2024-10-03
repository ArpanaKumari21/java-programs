class sort{
    public static void sortedarray(int ind,int arr[]){
        if(ind==arr.length-1){
            System.out.println("sorted");
            return;
        }
        if(arr[ind]>=arr[ind+1]){
            System.out.println("not sorted");
            return;
        }
        sortedarray(ind+1,arr);
    }
    public static void main(String[]args){
        int arr[]={1,2,3,4,};
        sortedarray(0,arr);
    }
}
class selection{
    public static void printArray(int arr[]){
    for (int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println();}
    public static void main(String[] args){
        int arr[]={7,8,3,1,2};
        for(int i=0;i<arr.length;i++){
            int smallest=arr[i];
            for(int j=i;j<arr.length;j++){
                if(arr[j]<smallest){
                    smallest=arr[j];
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
            }
        }
        }
        printArray(arr);
    }
}
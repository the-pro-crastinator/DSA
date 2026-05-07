// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// [0,1,0,3,12]
// [1,3,12,0,0]
// [1,2,0,0,5]
// [1,2,5,0,0]

class Main {
    static void swap(int arr[], int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j++;
            }
            else if(arr[i]!=0 && j!=0){
                swap(arr, i, i-j);
            }
        }
             for(int num:arr){
                System.out.print(num + " ");
            }
    }
}

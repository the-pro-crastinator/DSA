// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// 1 2 3 4 → 4 3 2 1

class Main {
    static void swap(int arr[], int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
}

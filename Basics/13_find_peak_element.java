// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// [1,2,3,1]
// 2
// [1,2,1,3,5,6,4]
// 1
// 5
// [5,4,3]
// 0

class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else if (arr[mid]>arr[mid+1]){
                end=mid;
            }
        }
        System.out.println(start);
    }
}

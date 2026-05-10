// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// arr = [1,2,2,2,3,4]
// target = 2
// 1
// arr = [1,3,5,7]
// target = 2
// -1

class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        int start = 0;
        int end = arr.length - 1;
        int pos = Integer.MIN_VALUE;
        int target = 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                pos = mid;
                end=mid-1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        if(pos==Integer.MIN_VALUE){
            System.out.println("-1");
        }else{
            System.out.println(pos);
        }
    }
}

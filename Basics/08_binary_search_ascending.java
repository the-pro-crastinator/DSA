// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// [2,4,6,8,10,11,14,18]
// target = 11

class Main {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,11,14,18};
        int start = 0;
        int end = arr.length - 1;
        int target = 11;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                System.out.println("target found at index " + mid);
                return;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
      System.out.println("target not found");
    }
}

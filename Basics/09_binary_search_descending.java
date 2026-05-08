// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// [18,15,11,9,6,4,2]
// target = 9

class Main {
    public static void main(String[] args) {

        int[] arr = {18,15,11,9,6,4,2};

        int start = 0;
        int end = arr.length - 1;
        int target = 9;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                System.out.println("target found at index " + mid);
                return;
            }
            else if(arr[mid] > target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        System.out.println("target not found");
    }
}

// Linear Search
// Best Case: O(1)
// Worst Case: O(n)
// Space Complexity: O(1)

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// arr = [2, 5, 7, 1]
// target = 7

class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 1};
        int target = 7;
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Found at index " + i);
                flag = true;
                break;
                // Alternative cleaner approach: use return instead of flag.
            }
        }
        if(!flag){
            System.out.println("-1");
        }
        // remember flags (very important)
    }
}

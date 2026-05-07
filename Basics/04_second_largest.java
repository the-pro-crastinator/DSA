// Current approach works for most cases
// Need to improve handling for:
// 1. Integer.MIN_VALUE edge cases
// 2. Cleaner second-largest existence check
// 3. Possibly reduce reliance on sentinel values
// [4, 7, 2, 9, 5]
// to find second largest i.e - 7

class Main {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 5};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            }
            else if(max>arr[i] && arr[i]>smax){
                smax = arr[i];
            }
        }
        if(smax==Integer.MIN_VALUE){
            System.out.println("second largest doesn't exist");
            System.out.println("the largest is: " + max);
        }else{
        System.out.println("largest is " + max);
        System.out.println("second largest is " + smax);
        }
    }
}

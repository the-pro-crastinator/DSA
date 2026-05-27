// Current approach works for most cases
// Need to improve handling for:
// See the comments. 
// [4, 7, 2, 9, 5]
// to find second largest i.e - 7

class Main {
    public static void main(String[] args) {
        int[] arr = {Integer.MIN_VALUE};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        boolean flag = true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            }
            else if(max>arr[i] && arr[i]>smax){
                smax = arr[i];
                flag = false;
            }
        }
        if(smax==Integer.MIN_VALUE && flag == true){
            System.out.println("second largest doesn't exist");
            System.out.println("the largest is: " + max);
        }else if(smax==Integer.MIN_VALUE && flag == false){
            System.out.println("second largest is: " + Integer.MIN_VALUE);
            System.out.println("the largest is: " + max);
        }else{
        System.out.println("largest is " + max);
        System.out.println("second largest is " + smax);
        }
    }
}

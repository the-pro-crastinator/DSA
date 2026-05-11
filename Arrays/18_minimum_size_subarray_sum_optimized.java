// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// arr = [2,3,1,2,4,3]
// target = 7
// minimum length
// [2,3,1,2] → 8 (length 4)
// [1,2,4] → 7 (length 3)
// [4,3] → 7 (length 2)
// 2

class Main {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target=7;
        int out = Integer.MAX_VALUE;
        int sum=0;
        int j=0;
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
                while(sum>=target){
                    if((i-j+1)<out){
                out=(i-j+1);
            }
                    sum-=arr[j];
                    j++;
                }
            }
        System.out.println(out);
    }
}

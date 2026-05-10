// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// arr = [2,1,5,1,3,2]
// k = 3
// [2,1,5] = 8
// [1,5,1] = 7
// [5,1,3] = 9
// [1,3,2] = 6
// 9

class Main {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k=3;
        int sum [] = new int [(arr.length-k+1)];
        
        for(int i=0;i<k;i++){
            sum[0] += arr[i];
        }
        int max=sum[0];
        for(int j=1;j<(arr.length-k+1);j++){
            sum[j] = sum[j-1] - arr[j-1] + arr[j+k-1];
            if(sum[j]>max){
                max=sum[j];
            }
        }
        System.out.println(max);
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// arr = [2,1,5,1,3,2]
// k = 3
// [2,1,5] = 8
// [1,5,1] = 7
// [5,1,3] = 9
// [1,3,2] = 6
// Maximum Sum = 9
// Subarray = [5,1,3]

class Main {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k=3;
        int sum=0;
        int pos = 0;
        
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        int max=sum;
        for(int j=1;j<(arr.length-k+1);j++){
            sum = sum - arr[j-1] + arr[j+k-1];
            if(sum>max){
                max=sum;
                pos=j;
            }
        }
        System.out.println(max);
        for(int l=pos;l<=pos+k-1;l++){
            System.out.print(arr[l] + " ");
        }
    }
}

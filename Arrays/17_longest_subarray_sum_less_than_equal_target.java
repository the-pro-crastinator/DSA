// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// arr = [2, 1, 5, 1, 3, 2]
// variable window size
// target = 7
// [2,1,5] → sum = 8 ❌
// [1,5,1] → sum = 7 ✅
// [5,1] → sum = 6 ✅
// [1,3,2] → sum = 6 ✅
// Output:
// 3

class Main {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int target=7;
        int out=0;
        int pos=0;
        int sum=0;
        int j=0;
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            pos++;
            if(sum>target){
                while(sum>target){
                    sum-=arr[j];
                    pos--;
                    j++;
                }
        }
        if(pos>out){
                out=pos;
            }
        }
        System.out.println(out);
    }
}

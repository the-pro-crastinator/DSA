// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// arr = [12,-1,-7,8,-15,30,16,28]
// k = 3
// [12,-1,-7]  → -1
// [-1,-7,8]   → -1
// [-7,8,-15]  → -7
// [8,-15,30]  → -15
// [-15,30,16] → -15
// [30,16,28]  → 0

class Main {
    public static void main(String[] args) {
        int[] arr = {12,-1,-7,8,-15,30,16,28};
        int k=3;
        int neg [] = new int [(arr.length-k+1)];
        for(int l=0;l<(arr.length-k+1);l++){
            neg[l] = 0;
        }
        
        for(int i=0;i<(arr.length-k+1);i++){
            for(int j=i;j<k+i;j++){
                if(arr[j]<0){
                    neg[i]=arr[j];
                    break;
                }
            }
        }
        for(int num:neg){
            System.out.println(num + " ");
        }
    }
}

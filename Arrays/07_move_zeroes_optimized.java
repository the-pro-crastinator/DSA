// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// [0,1,0,3,12]
// [1,3,12,0,0]
// [1,0,2,0,0,5]
// [1,2,5,0,0,0]

class Main {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                arr[i]=arr[j];
                if(i!=j){
                    arr[j]=0;
                }
                i++;
            }
        }
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
}

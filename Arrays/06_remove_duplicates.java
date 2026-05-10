// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// [1,1,2,2,3,4,4]
// [1,2,3,4]

class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4};
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        for(int k=0;k<=i;k++){
            System.out.print(arr[k] + " ");
        }
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// arr = [1, 3, -1, -3, 5, 3, 6, 7]
// k = 3
// [3, 3, 5, 5, 6, 7]

import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k=3;
        
        for(int i=0;i<arr.length-k+1;i++){
            int max=arr[i];
            for(int j=i;j<k+i;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }
            System.out.print(max + " ");
        }
    }
}

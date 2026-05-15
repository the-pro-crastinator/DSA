// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// [2, 1, 3, 5, 4]
// next greater element for every number
// 2 -> 3
// 1 -> 3
// 3 -> 5
// 5 -> -1
// 4 -> -1

import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {2, 1, 3, 5, 4};
        for(int i=0;i<arr.length;i++){
            int ans=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    ans=arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + "->" + ans);
        }
        }
}

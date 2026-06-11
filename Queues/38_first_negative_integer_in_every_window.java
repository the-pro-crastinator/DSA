// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// [12, -1, -7]     -> -1
// [-1, -7, 8]      -> -1
// [-7, 8, -15]     -> -7
// [8, -15, 30]     -> -15
// [-15, 30, 16]    -> -15
// [30, 16, 28]     -> 0

import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        
        Queue<Integer>q = new LinkedList<>();
        
        for(int i=0;i<arr.length;i++){
            if(!q.isEmpty() && q.peek()<i-k+1){
                q.poll();
            }
            if(arr[i]<0){
                q.offer(i);
            }
            
            if(i>=k-1){
                if(!q.isEmpty()){
                    System.out.print(arr[q.peek()] + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }
        }
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// [1, 3, -1]      -> 3
// [3, -1, -3]     -> 3
// [-1, -3, 5]     -> 5
// [-3, 5, 3]      -> 5
// [5, 3, 6]       -> 6
// [3, 6, 7]       -> 7

import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        
        Deque<Integer>dq = new LinkedList<>();
        
        for(int i=0;i<arr.length;i++){
            if(!dq.isEmpty() && dq.peekFirst()<i-k+1){
                dq.removeFirst();
            }
            if(!dq.isEmpty()){
                if(arr[i]>=arr[dq.peekLast()]){
                    while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]){
                        dq.removeLast();
                    }
                }
                dq.addLast(i);
            }else{
                dq.addLast(i);
                // we can remove this line
            }
            if(i>=k-1){
                System.out.print(arr[dq.peekFirst()] + " ");
            }
        }
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// 1 1 4 2 1 1 0 0

import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {73,74,75,71,69,72,76,73};
        Stack<Integer>stack = new Stack<>();
        int ans[] = new int[arr.length];
        
        for(int i=arr.length-1;i>=0;i--){
            if(!stack.isEmpty()){
                if(arr[stack.peek()]<=arr[i]){
                    while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                        stack.pop();
                    }
                    if(!stack.isEmpty()){
                        ans[i] = stack.peek()-i;
                    stack.push(i);
                    }else{
                        ans[i] = 0;
                    stack.push(i);
                    }
                }else{
                    ans[i] = stack.peek()-i;
                    stack.push(i);
                }
            }else{
                ans[i] = 0;
                stack.push(i);
            }
        }
        for(int num:ans){
            System.out.print(num + " ");
        }
    }
}

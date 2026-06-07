// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// 4  -> -1
// 5  -> 4
// 2  -> -1
// 10 -> 2
// 8  -> 2

import java.util.*;

class Main {
    public static void main(String[] args) {
        
       int arr[] = {4,5,2,10,8};
       Stack<Integer>stack = new Stack<>();
       
       for(int i=0;i<arr.length;i++){
           if(!stack.isEmpty()){
               if(stack.peek()<arr[i]){
                   System.out.println(arr[i] + "->" + stack.peek());
                   stack.push(arr[i]);
               }else{
                   while(!stack.isEmpty() && stack.peek()>=arr[i]){
                       stack.pop();
                   }
                   if(!stack.isEmpty()){
                       System.out.println(arr[i] + "->" + stack.peek());
                   stack.push(arr[i]);
                   }else{
                       System.out.println(arr[i] + "->" + -1);
                   stack.push(arr[i]);
                   }
               }
           }else{
               System.out.println(arr[i] + "->" + -1);
               stack.push(arr[i]);
           }
       }
    }
}

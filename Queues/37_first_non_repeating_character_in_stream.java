// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// a
// a
// b
// b

import java.util.*;
class Main {
    public static void main(String[] args) {
        char arr[] = {'a','b','a','c'};
        Queue<Character>q = new LinkedList<>();
        HashMap<Character, Integer>map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if(!q.isEmpty()){
                q.offer(arr[i]);
                if(map.containsKey(arr[i])){
                    map.put(arr[i], map.get(arr[i]) + 1);
                }else{
                    map.put(arr[i], 1);
                }
                if(map.get(q.peek())>1){
                    while(!q.isEmpty() && map.get(q.peek())>1){
                        q.remove();
                    }
                    if(!q.isEmpty()){
                        System.out.println(q.peek());
                    }else{
                        System.out.println(-1);
                    }
                }else{
                    System.out.println(q.peek());
                }
            }else{
                q.offer(arr[i]);
                map.put(arr[i], 1);
                System.out.println(q.peek());
            }
        }
    }
}

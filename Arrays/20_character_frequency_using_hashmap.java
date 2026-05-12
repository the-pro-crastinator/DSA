// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// "programming"
// p -> 1
// r -> 2
// o -> 1
// g -> 2
// ...

import java.util.*;
class Main {
    public static void main(String[] args) {
        int count=1;
        
        String s = "programming";
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }else{
            map.put(s.charAt(i), count);
            }
        }
            for(int i=0;i<s.length();i++){
                System.out.print(s.charAt(i));
                System.out.print("->");
                System.out.println(map.get(s.charAt(i)));
            }
    }
}

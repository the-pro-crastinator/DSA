// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// s = "eceba"
// k = 2
// 3

import java.util.*;
class Main {
    public static void main(String[] args) {
        
        String s = "eceba";
        int k=2;
        int j=0;
        int max=0;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }else{
            map.put(s.charAt(i), 1);
            }
            while(map.size()>k){
                map.put(s.charAt(j), map.get(s.charAt(j))-1);
                if(map.get(s.charAt(j))==0){
                    map.remove(s.charAt(j));
                }
                j++;
            }
            if(i-j+1>max){
                max=(i-j+1);
            }
        }
        System.out.println(max);
    }
}

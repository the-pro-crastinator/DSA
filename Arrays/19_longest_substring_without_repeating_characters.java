// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// "abcabcbb"
// 3
import java.util.*;
class Main {
    public static void main(String[] args) {
        int max=0;
        int j=0;
        
        String s = "abcabcbb";
        
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(j));
                    j++;
                }
            }
            set.add(s.charAt(i));
            if(i-j+1>max){
                max=(i-j+1);
            }
            }
        System.out.println(max);
    }
}

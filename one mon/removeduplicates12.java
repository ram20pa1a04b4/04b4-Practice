import java.io.*;
import java.util.*;

public class Solution {
    public static String removeDuplicates(String str) {
    
    Set<Character> set = new HashSet<>();
    
    
    StringBuilder sb = new StringBuilder();

    
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (!set.contains(c)) {
            set.add(c);
            sb.append(c);
        }
    }
    return sb.toString();
}


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String newStr = removeDuplicates(str);
        System.out.println(newStr);
    }
    
}

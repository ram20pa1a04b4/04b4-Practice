import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static String stringxor(String s,String t){
        String res = new String("");
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i)==t.charAt(i))
                res+="0";
            else
                res+="1";
        }
        return res ;
    }
    public static void main(String args[] ) throws Exception {
        String s,t;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        t = sc.next();
        System.out.println(stringxor(s,t));
    }
}

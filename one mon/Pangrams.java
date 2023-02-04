import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.HashSet;
class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
    // Write your code here
    HashSet<Character> set = new HashSet<Character>();
    s = s.replace(" ","");
    s = s.toLowerCase();
    char[] strChar = s.toCharArray();
    for(Character i:strChar){
        set.add(i);
    }
    if(set.size()==26){
        return "pangram";
    }
    else{
        return "not pangram";
    }
 }
}
    //s = input()
//alpha_set = set(char for char in s.lower() if char.isalpha())
// print("pangram" if len(alpha_set) == 26 else "not pangram")

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


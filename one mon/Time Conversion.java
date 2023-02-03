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

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    String t = s.trim();

    String is_pm = t.substring(8).toLowerCase();
    String yes = is_pm.trim();
    String time = t.substring(0,8);
    String[] as = time.split(":");
    int[] arr = new int[as.length];
    for (int i=0;i<as.length;i++){
        arr[i] = Integer.parseInt(as[i]);
    }
    if (yes.equals("pm")){
        if(arr[0] < 12){
            arr[0] += 12 ;
        }
    }
    else {
        if(arr[0] == 12){
            arr[0] = 0 ;
        }
    }
    String h;
    String m;
    String se;
    if(arr[0]<10){
         h = "0" + Integer.toString(arr[0]);
    }
    else{
         h = Integer.toString(arr[0]);
    }
    if(arr[1]<10){
         m = "0" + Integer.toString(arr[1]);
    }
     else{
         m = Integer.toString(arr[1]);
     }
    if(arr[2]<10){
         se = "0" + Integer.toString(arr[2]);
    }
     else{
         se = Integer.toString(arr[2]); 
     }
    String ans =  h +":"+ m +":"+ se ;
    return ans ;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

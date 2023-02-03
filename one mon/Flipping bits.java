import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();

        long mask = (1L << 32) - 1;
        
        for (int t = 0; t < r; t++) {
            long n = scanner.nextLong();
            System.out.println(n ^ mask);            
        }
        
        scanner.close();

    }

}

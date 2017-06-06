package solution;

import java.util.Scanner;

public class Solution {

    public static int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nFactorial = scan.nextInt();
        //print results
        System.out.println(factorial(nFactorial));
    }
}

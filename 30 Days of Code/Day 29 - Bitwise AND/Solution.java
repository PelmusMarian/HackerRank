package solution;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int solution = 0;

            for (int i = 1; i <= n; i++) {
                int a = i - 1;
                for (int b = i; b <= n; b++) {
                    if ((a & b) < k && (a & b) > solution) {
                        solution = a & b;
                    }
                }
            }
            System.out.println(solution);
        }
    }
}

package solution;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String s;

        if (t >= 1 && t <= 10) {
            for (int i = 0; i < t; i++) {
                s = scan.next();
                if (s.length() >= 2 && s.length() <= 10000) {
                    for (int j = 0; j < s.length(); j++) {
                        if ((j % 2) == 0) {
                            System.out.print(s.charAt(j));
                        }
                    }
                    System.out.print(" ");

                    for (int k = 0; k < s.length(); k++) {
                        if ((k % 2) != 0) {
                            System.out.print(s.charAt(k));
                        }
                    }
                }
                System.out.println("");
            }
        }
    }
}

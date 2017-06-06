package solution;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        int number;
        int count = 0;
        for (int i = 0; i < testCases; i++) {
            number = scan.nextInt();
            if (number < 2) {
                System.out.println("Not prime");
            } else {
                if (number % 2 == 0 && number > 2) {
                    System.out.println("Not prime");
                } else {
                    for (int j = 2; j < number / 2; j++) {
                        if (j % 2 == 0 && number > 2) {
                            continue;
                        } else {
                            if (number % j == 0) {
                                count++;
                            }
                        }
                        if (number / j < j) {
                            break;
                        }
                    }
                    if (count == 0) {
                        System.out.println("Prime");
                    } else {
                        System.out.println("Not prime");
                    }
                }
            }
            count = 0;
        }
    }
}

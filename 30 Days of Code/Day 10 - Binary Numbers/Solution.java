package solution;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n >= 1 && n <= Math.pow(10, 6)) {
            String s = Integer.toBinaryString(n);
            String[] sArr = s.split("0");
            //sort the array
            Arrays.sort(sArr);
            //print la last value from the array
            System.out.println(sArr[sArr.length - 1].length());
        }
    }
}

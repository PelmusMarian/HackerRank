package solution;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String currentDate = scan.nextLine();
        String expectedDate = scan.nextLine();

        int hackosFine = 0;

        String[] splitCurrentDate = currentDate.split(" ");
        int currentDay = Integer.parseInt(splitCurrentDate[0]);
        int currentMonth = Integer.parseInt(splitCurrentDate[1]);
        int currentYear = Integer.parseInt(splitCurrentDate[2]);

        String[] splitExpectedDate = expectedDate.split(" ");
        int expectedDay = Integer.parseInt(splitExpectedDate[0]);
        int expectedMonth = Integer.parseInt(splitExpectedDate[1]);
        int expectedYear = Integer.parseInt(splitExpectedDate[2]);

        if (currentYear > expectedYear) {
            hackosFine = 10000;
        } else if (currentMonth > expectedMonth && currentYear == expectedYear) {
            hackosFine = 500 * (currentMonth - expectedMonth);
        } else if (currentDay > expectedDay && currentMonth == expectedMonth) {
            hackosFine = 15 * (currentDay - currentMonth);
        } else {
            hackosFine = 0;
        }
        System.out.println(hackosFine);
    }
}

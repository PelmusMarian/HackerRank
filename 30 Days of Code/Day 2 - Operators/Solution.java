package solution;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
        //calculate total cost
        double tip = mealCost * ((double) tipPercent / 100);
        double tax = mealCost * ((double) taxPercent / 100);
        int totalCost = (int) Math.round(mealCost + tip + tax);
        //print results 
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}

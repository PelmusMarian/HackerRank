package solution;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String s = scan.next();
        try{
                System.out.println(Integer.parseInt(s));
        }
        catch(NumberFormatException e){
            System.out.println("Bad String");
        }
    }
}

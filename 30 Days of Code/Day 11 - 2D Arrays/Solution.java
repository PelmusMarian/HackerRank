package solution;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[6][6];
        int sum=0, rem=0;
        
        //fill the array
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++)
                arr[i][j] = scan.nextInt();
        }
        
        //must take firts value for comparation, can be any other
        sum = arr[0][0] + arr[0][1] + arr[0][2]+
                          arr[1][1] +
              arr[2][0] + arr[2][1] + arr[2][2];
        
        //make the math
        for(int i=0; i<=3; i++){
            for(int j=0; j<=3; j++){
                //hourglass form
                rem=arr[0+i][0+j] + arr[0+i][1+j] + arr[0+i][2+j]+
                                arr[1+i][1+j] +
                    arr[2+i][0+j] + arr[2+i][1+j] + arr[2+i][2+j];
                
                //find max
                if(rem > sum)
                    sum = rem;
            }
        }
        //print result
        System.out.println(sum);
    }
}
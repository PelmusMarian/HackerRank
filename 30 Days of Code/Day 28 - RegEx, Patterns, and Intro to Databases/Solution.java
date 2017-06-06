package solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List list = new ArrayList();

        for (int a0 = 0; a0 < N; a0++) {
            String[] s;
            String firstName = in.next();
            String emailID = in.next();
            s = emailID.split("@");
            if (s[1].equals("gmail.com")) {
                list.add(firstName);
            }
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

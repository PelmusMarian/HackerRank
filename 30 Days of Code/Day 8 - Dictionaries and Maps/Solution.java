package solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), phone;
        String name;

        //create map
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();

        //fill the map
        for (int i = 0; i < n; i++) {
            name = in.next();
            phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        //print value 
        while (in.hasNext()) {
            String s = in.next();
            System.out.println((phoneBook.containsKey(s)) ? s + "=" + phoneBook.get(s) : "Not found");
        }
        in.close();
    }
}

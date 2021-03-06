package solution;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {

    LinkedList<Character> q = new LinkedList<Character>();
    LinkedList<Character> s = new LinkedList<Character>();

    public void enqueueCharacter(char c) {
        q.addFirst(c);
    }

    public void pushCharacter(char c) {
        s.addFirst(c);
    }

    public char dequeueCharacter() {
        char c = q.getFirst();
        q.removeFirst();
        return c;
    }

    public char popCharacter() {
        char c = s.getLast();
        s.removeLast();
        return c;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}

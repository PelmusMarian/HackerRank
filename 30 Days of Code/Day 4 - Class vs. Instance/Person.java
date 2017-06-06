
package person;

import java.util.Scanner;

public class Person {

    private int age;

    public Person(int initialAge) {
        if (this.age >= -5 && this.age <= 30) {
            if (initialAge > 0) {
                this.age = initialAge;
            } else {
                System.out.println("Age is not valid, setting age to 0.");
                this.age = 0;
            }
        }
    }

    public void amIOld() {
        if (this.age < 13) {
            System.out.println("You are young.");
        } else if (this.age >= 13 && this.age < 18) {
            System.out.println("You are a teenager.");
        } else if (this.age >= 18) {
            System.out.println("You are old.");
        }
    }

    public void yearPasses() {
        this.age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}

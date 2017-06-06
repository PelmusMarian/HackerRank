package generics;

public class Printer<T> {

    public static <E> void printArray(E[] array) {
        for (E elements : array) {
            System.out.println(elements);
        }
    }
}

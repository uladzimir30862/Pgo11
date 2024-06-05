import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Main {

    private static int[] array = new int[10];
    private static Scanner scanner = new Scanner(System.in);

    public static int readNumber() throws NegativeNumberException {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return number;
    }

    public static void fillArray() {
        for (int i = 0; i < array.length; i++) {
            try {
                array[i] = readNumber();
            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
                array[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        fillArray();
        System.out.println("Array contents:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}

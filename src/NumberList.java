import java.util.Scanner;

public class NumberList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[0];
        System.out.println("Enter the numbers");

        int input;
        while ((input = scanner.nextInt()) != -1) {
            int[] tempArray = new int[numbers.length + 1];
            System.arraycopy(numbers, 0, tempArray, 0, numbers.length);
            tempArray[numbers.length] = input;
            numbers = tempArray;
        }

        System.out.println("Input Numbers:");
        for (int number : numbers) {
            System.out.print(number);
        }
    }
}

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        BubbleSort bs = new BubbleSort();
        int[] numbers = new int[16];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(256);
        }

        System.out.println("Before:");
        printNumbers(numbers);

        bs.bubbleSort(numbers);

        System.out.println("After:");
        printNumbers(numbers);
    }

    private static void printNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " | ");
        }
        System.out.println("\n");
    }
}

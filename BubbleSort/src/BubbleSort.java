
public class BubbleSort {

    public int[] bubbleSort(int[] numbers) {
        if (numbers.length <= 1) {
            System.out.println("Method execution aborted!");
            return numbers;
        } else {
            boolean hasSwapped;
            do {
                hasSwapped = false;
                for (int i = 0; i < numbers.length - 1; i++) {
                    if (numbers[i] > numbers[i + 1]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[i + 1];
                        numbers[i + 1] = temp;
                        hasSwapped = true;
                    }
                }
            } while (hasSwapped);

            return numbers;
        }
    }
}

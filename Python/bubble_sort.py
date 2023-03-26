class BubbleSort:
    def __init__(self):
        self

    def sort(self, numbers: list[int]) -> list[int]:
        has_swapped = True
        while (has_swapped):
            has_swapped = False
            for i in range(len(numbers) - 1):
                if numbers[i] > numbers[i + 1]:
                    temp = numbers[i + 1]
                    numbers[i + 1] = numbers[i]
                    numbers[i] = temp
                    has_swapped = True
        return numbers

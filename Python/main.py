import random as rd
from bubble_sort import *


def main() -> None:
    bs = BubbleSort()
    numbers = []
    for _ in range(10):
        numbers.append(rd.randint(0, 100))

    print("Before:")
    print(numbers)

    bs.sort(numbers)

    print("After:")
    print(numbers)


if __name__ == "__main__":
    main()

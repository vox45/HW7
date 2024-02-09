public class HW7 {
    public static void main(String[] args) {
task();


    }
    public static void task() {
        int[] array = {5, 2, 9, 1, 5, 6};

        System.out.println("Масив до сортування:");
        printArray(array);

        insertionSort(array);

        System.out.println("\nМасив після сортування вставками:");
        printArray(array);
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i], j = i - 1;

            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j--];
            }

            array[j + 1] = current;
        }
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

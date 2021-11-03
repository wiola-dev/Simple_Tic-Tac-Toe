import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        int greaterThan = scanner.nextInt();
        int sum = 0;

        for (int number : array) {
            if (number > greaterThan) {
                sum += number;
            }
        }
        System.out.println(sum);
    }
}
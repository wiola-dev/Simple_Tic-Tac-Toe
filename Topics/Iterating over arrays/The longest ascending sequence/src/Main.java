import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int[] numbers = new int[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            numbers[i] = scanner.nextInt();
        }

        int count = 1;
        int numberLongestAscending = 1;
        for (int i = 0; i < sizeArray - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                count++;
                numberLongestAscending = count;
            } else if (numberLongestAscending < count) {
                numberLongestAscending = count;
            } else {
                count = 1;
            }
        }
        System.out.println(numberLongestAscending);
    }
}
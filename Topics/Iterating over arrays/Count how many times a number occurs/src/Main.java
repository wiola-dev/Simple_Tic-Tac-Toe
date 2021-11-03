import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
        }

        int numberN = scanner.nextInt();
        int counterN = 0;
        for (int number : array) {
            if (number == numberN) {
                counterN++;
            }
        }
        System.out.println(counterN);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int[] numbers = new int[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maxNumber = 0;
        int firstMaximumIndex = 0;
        for (int i = 0; i < sizeArray; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
                firstMaximumIndex = i;
            }
        }
        System.out.println(firstMaximumIndex);
    }
}
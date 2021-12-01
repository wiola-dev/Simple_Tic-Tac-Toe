import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            array[i] = scanner.nextInt();
        }
        int number = scanner.nextInt();
        boolean containN = false;
        for (int n : array) {
            if (n == number) {
                containN = true;
            }
        }
        System.out.println(containN);
    }
}
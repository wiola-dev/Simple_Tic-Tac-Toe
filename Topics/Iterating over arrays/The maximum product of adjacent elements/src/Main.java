import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            array[i] = scanner.nextInt();
        }

        if (sizeArray == 2) {
            System.out.println(array[0] * array[1]);
        } else {
            int max = 0;

            for (int i = 0; i < sizeArray - 1; i++) {
                if (array[i] * array[i + 1] > max) {
                    max = array[i] * array[i + 1];
                }
            }
            System.out.println(max);
        }
    }
}
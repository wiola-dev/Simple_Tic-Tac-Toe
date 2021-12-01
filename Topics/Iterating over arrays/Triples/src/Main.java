import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            array[i] = scanner.nextInt();
        }
        int count = 0;

        if (sizeArray >= 3) {
            for (int i = 0; i < sizeArray - 2; i++) {

                if (array[i] + 1 == array[i + 1] && array[i + 1] + 1 == array[i + 2]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
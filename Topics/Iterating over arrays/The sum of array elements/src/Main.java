import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] array =new int[sizeOfArray];
        int sum = 0;

        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        System.out.println(sum);
    }
}
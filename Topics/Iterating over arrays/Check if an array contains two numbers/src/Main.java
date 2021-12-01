import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            array[i] = scanner.nextInt();
        }
        int numberN = scanner.nextInt();
        int numberM = scanner.nextInt();

        boolean containNM = false;
        for (int i = 0; i < sizeArray - 1; i++) {
            if (array[i] == numberN && array[i+1] == numberM || array[i] == numberM && array[i+1] == numberN ) {
                containNM = true;
            }
        }
        System.out.println(containNM);
    }
}
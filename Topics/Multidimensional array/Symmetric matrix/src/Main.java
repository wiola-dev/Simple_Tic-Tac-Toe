import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();

        if (arraySize == 1) {
            System.out.println("YES");
        } else {
            int[][] matrix = new int[arraySize][arraySize];
            for (int row = 0; row < arraySize; row++) {
                for (int col = 0; col < arraySize; col++) {
                    matrix[row][col] = scanner.nextInt();
                }
            }
            boolean isSymmetric = true;
            for (int row = 0; row < arraySize; row++) {
                if (!isSymmetric) {
                    break;
                }
                for (int col = row + 1; col < arraySize; col++) {
                    if (matrix[row][col] != matrix[col][row]) {
                        isSymmetric = false;
                        break;
                    }
                }
            }
            System.out.println(isSymmetric ? "YES" : "NO");
        }
    }
}

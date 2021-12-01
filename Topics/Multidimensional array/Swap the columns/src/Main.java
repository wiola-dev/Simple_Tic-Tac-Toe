import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[scanner.nextInt()][scanner.nextInt()];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int numberI = scanner.nextInt();
        int numberJ = scanner.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][numberJ];
            matrix[i][numberJ] = matrix[i][numberI];
            matrix[i][numberI] = temp;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
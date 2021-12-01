import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeRow = scanner.nextInt();
        int sizeCol = scanner.nextInt();
        int[][] matrix = new int[sizeRow][sizeCol];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        int rowArray = 0;
        int colArray = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] > max) {
                    max = matrix[row][col];
                    rowArray = row;
                    colArray = col;
                }
            }
        }
        System.out.println(rowArray + " " + colArray);
    }
}
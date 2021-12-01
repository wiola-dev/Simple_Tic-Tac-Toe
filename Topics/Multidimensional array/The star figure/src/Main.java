import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimArray = scanner.nextInt();
        char[][] twoDimArray = new char[dimArray][dimArray];

        for (int i = 0; i < dimArray; i++) {
            for (int j = 0; j < dimArray; j++) {
                twoDimArray[i][j] = '.';
            }
        }
        int middle = dimArray / 2;
        for (int i = 0; i < dimArray; i++) {
            for (int j = 0; j < dimArray; j++) {
                if (i == middle || j == middle || i == j || j == dimArray - 1 - i) {
                    twoDimArray[i][j] = '*';
                }
            }
        }
        for (int i = 0; i < dimArray; i++) {
            for (int j = 0; j < dimArray; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
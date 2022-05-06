package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] matrixTicTacToe = new char[3][3];
        System.out.print("Enter cells:");
        String cells = scanner.nextLine();

        int increment = 0;
        for (int row = 0; row < matrixTicTacToe.length; row++) {
            for (int col = 0; col < matrixTicTacToe[row].length; col++) {
                matrixTicTacToe[row][col] = cells.charAt(increment);
                increment++;
            }
        }
        System.out.println("---------");

        for (int row = 0; row < matrixTicTacToe.length; row++) {
            System.out.print("| ");
            for (int col = 0; col < matrixTicTacToe[row].length; col++) {
                System.out.print(matrixTicTacToe[row][col] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");

        boolean isNumber = false;
        boolean FreeCell = true;

        while (FreeCell) {
            System.out.println("Enter the coordinates:");
            String coordinatesRow = scanner.next();
            //String coordinatesCol = scanner.next();
            //coordinatesRow = scanner.next();

            char token = ' ';
            char charDecimalZero = 48;

            // boolean number = false;
            for (int i = 0; i < coordinatesRow.length(); i++) {
                token = coordinatesRow.charAt(i);
                for (int j = 0; j < 10; j++) {
                    if (token == (charDecimalZero + j)) {
                        isNumber = true;
                        break;
                    } else {
                        isNumber = false;
                    }
                }
                if (!isNumber) {
                    break;
                }
            }
            if (!isNumber) {
                System.out.println("You should enter numbers!");
                scanner.nextLine();
                continue;
            }

            String coordinatesCol = scanner.next();
            for (int i = 0; i < coordinatesCol.length(); i++) {
                token = coordinatesCol.charAt(i);
                for (int j = 0; j < 10; j++) {
                    if (token == (charDecimalZero + j)) {
                        isNumber = true;
                        break;
                    } else {
                        isNumber = false;
                    }
                }
                if (!isNumber) {
                    break;
                }
            }

            if (!isNumber) {
                System.out.println("You should enter numbers!");
                continue;
            } else {
                if (coordinatesRow.length() > 1) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue;
                } else if (coordinatesRow.charAt(0) != charDecimalZero + 1 && coordinatesRow.charAt(0) != charDecimalZero + 2 && coordinatesRow.charAt(0) != charDecimalZero + 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue;
                } else if (coordinatesCol.charAt(0) != charDecimalZero + 1 && coordinatesCol.charAt(0) != charDecimalZero + 2 && coordinatesCol.charAt(0) != charDecimalZero + 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue;
                }
            }

            int gamercoordinatesRow = Integer.parseInt(coordinatesRow) - 1;
            int gamercoordinatesCol = Integer.parseInt(coordinatesCol) - 1;

            if (matrixTicTacToe[gamercoordinatesRow][gamercoordinatesCol] != '_') {
                System.out.println("This cell is occupied! Choose another one!");
            } else {
                matrixTicTacToe[gamercoordinatesRow][gamercoordinatesCol] = 'X';

                System.out.println("---------");
                int countFreeCell = 0;
                for (int row = 0; row < matrixTicTacToe.length; row++) {
                    System.out.print("| ");
                    for (int col = 0; col < matrixTicTacToe[row].length; col++) {
                        System.out.print(matrixTicTacToe[row][col] + " ");
                        //if (matrixTicTacToe[row][col] == '_') {
                        //    countFreeCell++;
                        //}
                    }
                    System.out.println("|");
                }
                System.out.println("---------");
                break;
              //  if (countFreeCell == 0) {
              //      FreeCell = false;
                }
            }
        }


        boolean winX = false;
        boolean winO = false;

        char charX = 'X';
        char charO = 'O';
        char char_ = '_';
        char charSpace = ' ';

        int countX = 0;
        int countO = 0;
        int count_ = 0;
/*
        for (int row = 0; row < matrixTicTacToe.length; row++) {
            for (int col = 0; col < matrixTicTacToe[row].length; col++) {
                if (matrixTicTacToe[row][col] == charX) {
                    countX++;
                } else if (matrixTicTacToe[row][col] == charO) {
                    countO++;
                } else if (matrixTicTacToe[row][col] == char_ || matrixTicTacToe[row][col] == charSpace) {
                    count_++;
                }
            }
        }
        for (int row = 0; row < matrixTicTacToe.length; row++) {
            int countXH = 0;
            int countOH = 0;
            for (int col = 0; col < matrixTicTacToe[row].length; col++) {
                if (matrixTicTacToe[row][col] == 'X') {
                    countXH++;
                }
                if (matrixTicTacToe[row][col] == 'O') {
                    countOH++;
                }
            }
            if (countXH == 3) {
                winX = true;
            }
            if (countOH == 3) {
                winO = true;
            }
        }
        for (int col = 0; col < matrixTicTacToe.length; col++) {
            int countXV = 0;
            int countOV = 0;
            for (int row = 0; row < matrixTicTacToe.length; row++) {
                if (matrixTicTacToe[row][col] == 'X') {
                    countXV++;
                }
                if (matrixTicTacToe[row][col] == 'O') {
                    countOV++;
                }
            }
            if (countXV == 3) {
                winX = true;
            }
            if (countOV == 3) {
                winO = true;
            }
        }
        int countXL = 0;
        int countOL = 0;
        for (int slash = 0; slash < matrixTicTacToe.length; slash++) {
            if (matrixTicTacToe[slash][slash] == 'X') {
                countXL++;
            }
            if (matrixTicTacToe[slash][slash] == 'O') {
                countOL++;
            }

            if (countXL == 3) {
                winX = true;
            }
            if (countOL == 3) {
                winO = true;
            }
        }
        int countXR = 0;
        int countOR = 0;
        for (int backslash = 0; backslash < matrixTicTacToe.length; backslash++) {
            if (matrixTicTacToe[backslash][2 - backslash] == 'X') {
                countXR++;
            }
            if (matrixTicTacToe[backslash][2 - backslash] == 'O') {
                countOR++;
            }
            if (countXR == 3) {
                winX = true;
            }
            if (countOR == 3) {
                winO = true;
            }
        }

*/
//        if (winX && winO) {
//            System.out.println("Impossible");
//        } else if (!winX && !winO && (countX - countO > 1 || countO - countX > 1)) {
//            System.out.println("Impossible");
//        } else if (winO && !winX && (countO - countX == 1 || countX == countO)) {
//            System.out.println("O wins");
//        } else if (winX && !winO && (countX - countO == 1 || countX == countO)) {
//            System.out.println("X wins");
//        } else if (!winX && !winO && (countX == countO && count_ > 0)) {
//            System.out.println("Game not finished");
//        } else if (!winX && !winO && countX - countO == 1 && count_ == 0 || countO - countX == 1 && count_ == 0) {
//            System.out.println("Draw");
//        }
    }
//}

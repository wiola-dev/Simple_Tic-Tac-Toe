package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cells = scanner.nextLine();
        char char1 = cells.charAt(0);
        char char2 = cells.charAt(1);
        char char3 = cells.charAt(2);
        char char4 = cells.charAt(3);
        char char5 = cells.charAt(4);
        char char6 = cells.charAt(5);
        char char7 = cells.charAt(6);
        char char8 = cells.charAt(7);
        char char9 = cells.charAt(8);

        System.out.println("Enter cells: " + cells);
        System.out.println("");
        System.out.println("---------");
        System.out.println("| " + char1 + " " + char2 + " " + char3 + " |");
        System.out.println("| " + char4 + " " + char5 + " " + char6 + " |");
        System.out.println("| " + char7 + " " + char8 + " " + char9 + " |");
        System.out.println("---------");

    }
}

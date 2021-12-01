import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int companies = scanner.nextInt();
        int[] yearlyIncomes = new int[companies];
        int[] individualTaxes = new int[companies];

        for (int i = 0; i < companies; i++) {
            yearlyIncomes[i] = scanner.nextInt();
        }
        for (int i = 0; i < companies; i++) {
            individualTaxes[i] = scanner.nextInt();
        }
        double maxTax = 0;
        int position = 0;

        for (int i = 0; i < companies; i++) {
            if (yearlyIncomes[i] * individualTaxes[i] > maxTax) {
                maxTax = yearlyIncomes[i] * individualTaxes[i];
                position = i;
            }
        }
        System.out.println(position + 1);
    }
}

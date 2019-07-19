import java.util.Scanner;

public class PcGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());

        double countA = 0;
        double countB = 0;
        double countC = 0;
        double countD = 0;

        for (int i = 1; i <= n ; i++) {
            String a = scanner.nextLine();
            if (a.equals("Hearthstone")) {
                countA++;
            } else if (a.equals("Fornite")) {
                countB++;
            } else if (a.equals("Overwatch")) {
                countC++;
            } else {
                countD++;
            }
        }
        System.out.printf("Hearthstone - %.2f%%%n",countA / n * 100);
        System.out.printf("Fornite - %.2f%%%n",countB / n * 100);
        System.out.printf("Overwatch - %.2f%%%n",countC / n * 100);
        System.out.printf("Others - %.2f%%",countD / n * 100);

    }
}

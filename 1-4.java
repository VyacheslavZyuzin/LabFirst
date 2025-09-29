import java.util.Scanner;

public class num4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 0, M = 0;
        while (true) {
            System.out.print("Введите N этажей: ");
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                if (N > 0) break;
                else System.out.println("N должно быть положительным.");
            } else {
                System.out.println("Введите целое число.");
                scanner.next();
            }
        }
        while (true) {
            System.out.print("Введите M квартиру: ");
            if (scanner.hasNextInt()) {
                M = scanner.nextInt();
                int totalApartments = N * 3;
                if (M > 0 && M <= totalApartments) break;
                else System.out.println("Квартиры " + M + " нет. Всего квартир: " + totalApartments);
            } else {
                System.out.println("Введите целое число.");
                scanner.next();
            }
        }
        int actualFloor = (M - 1) / 3 + 1;
        int elevatorFloor = (actualFloor % 2 == 0) ? actualFloor - 1 : actualFloor;
        if (elevatorFloor < 1) elevatorFloor = 1;
        System.out.println("Лифт должен доставить пассажира на " + elevatorFloor + " этаж");
        scanner.close();
    }
}

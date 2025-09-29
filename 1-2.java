public class num2 {
    public static void main(String[] args) {
        System.out.println("Таблица умножения в текстовом виде:");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " × " + j + " = " + (i * j));
            }
        }
        System.out.println("\n" + "=".repeat(50) + "\n");
        System.out.println("Таблица умножения в виде таблицы:");
        System.out.print("   |");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println("\n" + "---|" + "---".repeat(9));
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}

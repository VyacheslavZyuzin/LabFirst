import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Введите год: ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Ошибка, год должен быть целым числом.");
                scanner.next();
            }
        }
        String[] animals = {
                "Крысы", "Коровы", "Тигра", "Зайца",
                "Дракона", "Змеи", "Лошади", "Овцы",
                "Обезьяны", "Курицы", "Собаки", "Свиньи"
        };
        int animalIndex = (year - 1996) % 12;
        if (animalIndex < 0) {
            animalIndex += 12;
        }
        System.out.println(year + " год - год " + animals[animalIndex]);
        scanner.close();
    }
}

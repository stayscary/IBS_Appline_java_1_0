import java.util.Scanner;

public class Homework_13 {
    public static void main(String[] args) {
        // Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами.
        // Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = scanner.nextLine();

        String[] arrayStr = str.split(" ");
        int counter = 0;

        // 1. Выведите слова, состоящие только из латиницы.
        System.out.print("1. После проверки: ");
        for (String word : arrayStr) {
            if (word.matches("[a-zA-Z]+")) {
                System.out.print(word + " ");
                counter++;
            }
        }

        // 2. Выведите количество этих слов
        System.out.println("\n2. Кол-во слов: " + counter);

    }
}

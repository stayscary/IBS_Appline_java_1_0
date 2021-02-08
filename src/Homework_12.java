import java.util.Scanner;

public class Homework_12 {
    public static void main(String[] args) {
        //Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();

        // 1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).
        boolean contains = str.contains("Java");
        System.out.println("1. " + contains);

        // 2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
        boolean startsWith = str.startsWith("I like");
        System.out.println("2. " + startsWith);

        // 3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
        boolean endsWith = str.endsWith("!!!");
        System.out.println("3. " + endsWith);

        // 4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
        if (contains & startsWith & endsWith) {
            System.out.println("4. " + str.toUpperCase());
        }

        // 5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран  (используйте substring()).
        System.out.println("5. " + str.replaceAll("a", "o").substring(7, 11));

    }
}

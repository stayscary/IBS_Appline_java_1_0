import java.util.Scanner;

public class Homework_8 {
    public static void main(String[] args) {
        // 1. Напишите программу, где пользователь вводит любое целое положительное число n. '
        // А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
        Scanner scanner = new Scanner(System.in);
        long answer = 0;
        System.out.print("Введите любое целое положительное число: ");
        long n = scanner.nextLong();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                answer += i;
            }
        }
        System.out.println("Ответ: " + answer);
    }
}

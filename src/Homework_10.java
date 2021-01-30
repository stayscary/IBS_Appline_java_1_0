import java.util.Scanner;

public class Homework_10 {
    public static void main(String[] args) {
        // 1. Напишите программу, где пользователь вводит данные с клавиатуры в матрицу.
        // Размерность матрицы задается пользователем.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте размер матрицы [n:m]:");
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.print("m = ");
        int m = scanner.nextInt();

        int[][] array = new int[n][m];

        System.out.println("Введите элементы массива по 1 числу:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // 2. После этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.
        System.out.println("Матрица:");
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

        System.out.println("Первая строка матрицы:");
        for (int i = 0; i < array[0].length; i++) {
            System.out.print(array[0][i] + " ");
        }
    }
}

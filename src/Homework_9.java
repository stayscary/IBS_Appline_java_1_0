import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Homework_9 {
    public static void main(String[] args) {
        // 1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
        Scanner scanner = new Scanner(System.in);
        double average;
        double sum = 0;

        System.out.print("Задайте размер массива: ");
        int n = scanner.nextInt();

        double[] array = new double[n];

        System.out.println("Введите элементы массива по 1 числу:");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextDouble();
        }

        // 2. Посчитайте среднее арифметическое элементов массива.
        for (double number:array) {
            sum += number;
        }
        average = sum / array.length;
        System.out.println("Среднее арифметическое массива: " + average);

        // 3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
        System.out.println("Элементы массива (array[i] * average):");
        for (double number:array) {
            System.out.printf("%.2f ", number * average);
        }
    }
}

import java.util.Arrays;
import java.util.Random;

public class Homework_14 {
    public static void main(String[] args) {
        // 1. Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20.
        Random random = new Random();
        int[] array = new int[15];

        System.out.print("1. Массив чисел: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(40) - 20;
            System.out.print(array[i] + " ");
        }

        // 2. Выведите максимальный и минимальный элемент массива.
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        System.out.println("\n2. Максимальный элемент: " + max);
        System.out.println("   Минимальный элемент: " + min);

        // 3. Из максимального и минимального значения выведите наибольшее по модулю.
        System.out.println("3. Максимальное по модулю: " + (Integer.max(Math.abs(max), Math.abs(min))));

    }
}

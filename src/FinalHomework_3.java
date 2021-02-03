import java.util.Arrays;
import java.util.Scanner;

public class FinalHomework_3 {
    public static void main(String[] args) {
        // 1. Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
        Scanner scanner = new Scanner(System.in);
        int max;
        int index = 0;

        System.out.print("1. Введите кол-во строк: ");
        int n = scanner.nextInt();

        String[] array = new String[n];
        int[] intArray = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Строка %d: ", i+1);
            array[i] = scanner.next();
        }

        // 2. Среди данных строк найти строку с максимальным количеством различных символов.
        for (int i = 0; i < array.length; i++) {
            intArray[i] = (int) array[i].chars().distinct().count();
        }

        // 3. Если таких строк будет много, то вывести первую.
        max = Arrays.stream(intArray).max().getAsInt();
        for (int i = 0; i < intArray.length; i++) {
            if (max == intArray[i]) {
                index = i;
                break;
            }
        }

        System.out.println("Ответ: " + array[index]);
    }
}

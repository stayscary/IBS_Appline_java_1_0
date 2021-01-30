import java.util.Scanner;

public class Homework_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average;
        double floor;
        // 1. Ввести три числа с клавиатуры x, y, z
        System.out.print("Введите число x = ");
        double x = scanner.nextDouble();

        System.out.print("Введите число y = ");
        double y = scanner.nextDouble();

        System.out.print("Введите число z = ");
        double z = scanner.nextDouble();

        // 2. Найти и вывести в консоль среднее арифметическое этих чисел.
        average = (x + y + z) / 3;
        System.out.println("Среднее арифметическое чисел x, y, z = " + average);

        // 3. Разделить среднее арифметическое на 2 и округлить в меньшую сторону
        floor = Math.floor(average / 2);
        System.out.println("floor = " + floor);

        // 4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if (floor > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}

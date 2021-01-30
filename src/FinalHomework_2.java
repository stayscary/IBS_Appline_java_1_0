import java.util.Scanner;

public class FinalHomework_2 {
    public static void main(String[] args) {
        // Напишите программу, которая позволит решить простое уравнение относительно x.
        // Программа принимает на вход строку длиной 5 символов.
        // Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
        // Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.
        // Нужно найти неизвестное.
        Scanner scanner = new Scanner(System.in);
        int y, z;
        System.out.print("Ввод: ");
        String equation = scanner.nextLine();
        if (equation.charAt(0) == 'x') {
            y = Integer.parseInt(String.valueOf(equation.charAt(2)));
            z = Integer.parseInt(String.valueOf(equation.charAt(4)));
            if (equation.charAt(1) == '-') {
                System.out.println("x = " + (z + y));
            } else {
                if (y > z) {
                    System.out.println("x = -" + (y - z));
                } else {
                    System.out.println("x = " + (z - y));
                }
            }
        } else if (equation.charAt(2) == 'x') {
            y = Integer.parseInt(String.valueOf(equation.charAt(0)));
            z = Integer.parseInt(String.valueOf(equation.charAt(4)));
            if (equation.charAt(1) == '-') {
                if (y > z) {
                    System.out.println("x = " + (y - z));
                } else {
                    System.out.println("x = -" + (z - y));
                }
            } else {
                if (y > z) {
                    System.out.println("x = -" + (y - z));
                } else {
                    System.out.println("x = " + (z - y));
                }
            }
        } else if (equation.charAt(4) == 'x') {
            y = Integer.parseInt(String.valueOf(equation.charAt(0)));
            z = Integer.parseInt(String.valueOf(equation.charAt(2)));
            if (equation.charAt(1) == '-') {
                if (y > z) {
                    System.out.println("x = " + (y - z));
                } else {
                    System.out.println("x = -" + (z - y));
                }
            } else {
                System.out.println("x = " + (y + z));
            }
        } else {
            System.out.println("Не могу решить данное уравнение :(");
        }
    }
}

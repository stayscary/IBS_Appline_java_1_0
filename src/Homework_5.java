import java.util.Scanner;

public class Homework_5 {
    public static void main(String[] args) {

        //Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’.
        //В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите число y: ");
        double y = scanner.nextDouble();

        System.out.print("Введите одну из операция: +, -, /, *: ");
        String operation = scanner.next();

        if (y == 0 & operation.equals("/")) {
            System.out.println("На ноль делить нельзя!");
        } else {
            calc(x, y, operation);
        }
    }

    private static void calc(double x, double y, String operation) {

        switch (operation) {
            case "+":
                System.out.println(x + " + " + y + " = " + (x + y));
                break;
            case "-":
                System.out.println(x + " - " + y + " = " + (x - y));
                break;
            case "/":
                System.out.println(x + " / " + y + " = " + (x / y));
                break;
            case "*":
                System.out.println(x + " * " + y + " = " + (x * y));
                break;
            default:
                System.out.println("Неизвестная операция :(");
                break;
        }
    }
}

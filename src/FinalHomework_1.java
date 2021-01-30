import java.util.Scanner;

public class FinalHomework_1 {
    public static void main(String[] args) {
        //Напишите программу конвертер валют.
        // Программа должна переводить рубли в доллары по текущему курсу.
        // Пользователь вводит текущий курс и количество рублей.
        // Итоговое значение должно быть округлено до двух знаков после запятой.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Курс доллара: ");
        double dollar = scanner.nextDouble();
        System.out.print("Количество рублей: ");
        double rub = scanner.nextDouble();
        System.out.printf("Итого: %.2f долларов", (rub / dollar));
    }
}

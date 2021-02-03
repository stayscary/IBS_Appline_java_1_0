import java.util.Scanner;

public class Homework_11 {
    public static void main(String[] args) {
        // 1. Ввести первое  число с клавиатуры и записать его в строковую переменную.
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите первое число: ");
        String strNumber = scanner.next();
        
        // 2. Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
        System.out.print("Введите второе число: ");
        int intNumber = scanner.nextInt();
        int convertedStrNumber = Integer.parseInt(strNumber);

        // 3. Сравнить 2 числа и вывести большее на экран. 
        // 4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
        if (intNumber > convertedStrNumber) {
            System.out.println("Большее число: " + intNumber);
            System.out.println("Меньшее число: " + (double) convertedStrNumber);
        } else if (intNumber < convertedStrNumber) {
            System.out.println("Большее число: " + convertedStrNumber);
            System.out.println("Меньшее число: " + (double) intNumber);
        } else {
            System.out.print("Числа равны друг другу = " + intNumber);
        }
        
    }
}

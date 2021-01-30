import java.util.Scanner;

public class Homework_6 {
    public static void main(String[] args) {

        // 1. Пользователю предлагается на выбор ввести массу или расстояние.
        Scanner scanner = new Scanner(System.in);
        int type;
        int unit;
        double value;

        System.out.println("Конвертер физических величин");
        System.out.print("Выберите что переводить: 1 - масса, 2 - расстояние: ");
        type = scanner.nextInt();

        // 2. Пользователю предлагается выбрать единицу измерения.
        if (type == 1) {
            System.out.print("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - фунт, 4 - миллиграмм: ");
        } else {
            System.out.print("Выберите единицу измерения: 1 - метр, 2 - сантиметр, 3 - дециметр, 4 - миллиметр: ");
        }
        unit = scanner.nextInt();

        // 3. Пользователю предлагается ввести количество выбранных единиц:
        System.out.print("Введите количество единиц: ");
        value = scanner.nextInt();

        converter(type, unit, value);
    }

    private static void converter(int type, int unit, double value) {
        switch (type) {
            case 1:
                switch (unit) {
                    case 1:
                        System.out.printf("Результат: \n" +
                                        "Граммы: %.2f \nКилограммы: %.2f \nФунты: %.2f \nМиллиграммы: %.2f",
                                         value, value / 1000, value * 0.0022046, value * 1000);
                        break;
                    case 2:
                        System.out.printf("Результат: \n" +
                                        "Граммы: %.2f \nКилограммы: %.2f \nФунты: %.2f \nМиллиграммы: %.2f",
                                        value * 1000, value, value * 2.20462, value * 1000000);
                        break;
                    case 3:
                        System.out.printf("Результат: \n" +
                                        "Граммы: %.2f \nКилограммы: %.2f \nФунты: %.2f \nМиллиграммы: %.2f",
                                        value * 453.592, value * 0.453592, value, value * 453592);
                        break;
                    case 4:
                        System.out.printf("Результат: \n" +
                                        "Граммы: %.2f \nКилограммы: %.2f \nФунты: %.2f \nМиллиграммы: %.2f",
                                        value / 1000, value / 1000000, value * 2.204620, value);
                        break;
                    default:
                        System.out.println("Неизвестная единица измерения :(");
                        break;
                }
                break;
            case 2:
                switch (unit) {
                    case 1:
                        System.out.printf("Результат: \n" +
                                        "Метры: %.2f \nСантиметры: %.2f \nДециметры: %.2f \nМиллиметры: %.2f",
                                value, value * 100, value * 10, value * 1000);
                        break;
                    case 2:
                        System.out.printf("Результат: \n" +
                                        "Метры: %.2f \nСантиметры: %.2f \nДециметры: %.2f \nМиллиметры: %.2f",
                                value / 100, value, value / 10, value * 10);
                        break;
                    case 3:
                        System.out.printf("Результат: \n" +
                                        "Метры: %.2f \nСантиметры: %.2f \nДециметры: %.2f \nМиллиметры: %.2f",
                                value / 10, value * 10, value, value * 100);
                        break;
                    case 4:
                        System.out.printf("Результат: \n" +
                                        "Метры: %.2f \nСантиметры: %.2f \nДециметры: %.2f \nМиллиметры: %.2f",
                                value * 1000, value * 10, value * 100, value);
                        break;
                    default:
                        System.out.println("Неизвестная единица измерения :(");
                        break;
                }
                break;
            default:
                System.out.println("Неизвестная единица измерения :(");
                break;
        }
    }

}

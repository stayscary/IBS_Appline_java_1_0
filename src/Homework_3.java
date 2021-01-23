public class Homework_3 {
    public static void main(String[] args) {
        int num;
        int[] array = new int[]{1, 2, 3, 4, 5};

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Меняем местами первый и последний элементы массива array.
        num = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = num;

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Сумма первого и среднего элемента = " + (array[0] + array[array.length / 2]));
    }
}

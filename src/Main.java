import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task4 ();
    }
    static int[] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1 () {
        int amountOfExpenses = 0;
        for (int i = 0; i < arr.length; i++) {
            amountOfExpenses = amountOfExpenses + arr[i];
        }
        System.out.println("Сумма трат за месяц составила "+ amountOfExpenses +" рублей.");
    }
    public static void task2 () {
        int min = arr [0];
        int max = arr [0];
        for (int i : arr) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей.");
    }
    public static void task3 () {
        int amountOfExpenses = 0;
        for (int i = 0; i < arr.length; i++) {
            amountOfExpenses = amountOfExpenses + arr[i];
        }
        double averageAmount = amountOfExpenses / 30;
        System.out.println("Средняя сумма трат за месяц составила " +averageAmount+ " рублей.");
    }
    public static void task4 () {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(char i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = temp;
        }
            System.out.print(reverseFullName);
    }
}

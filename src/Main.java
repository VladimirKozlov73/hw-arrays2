import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        //Задача 1
        System.out.println("Задача 1");
        int [] monthlyPayments= new int [] {72_000, 150_000, 49_000, 64_000, 52_000};
        int sum = 0;
        for (int currentValue : monthlyPayments) {
            sum += currentValue;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println();

        //Задача 2
        System.out.println("Задача 2");
        int [] weeklyExpenses = new int [] {12_000, 4568, 1391, 27899, 9426};
        int minWeeklyExpenses = weeklyExpenses [0];
        int maxWeeklyExpenses = weeklyExpenses [0];
        for (int i = 0; i < weeklyExpenses.length; i++) {
            if (minWeeklyExpenses > weeklyExpenses[i]) {
                minWeeklyExpenses = weeklyExpenses[i];
            }
            if (maxWeeklyExpenses < weeklyExpenses [i]) {
                maxWeeklyExpenses = weeklyExpenses [i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minWeeklyExpenses +
                " рублей. Максимальная сумма трат за неделю составила " + maxWeeklyExpenses + " рублей");
        System.out.println();

        //Задача 3
        System.out.println("Задача 3");
        int [] monthlyExpenses = new int[] {387_000, 155678, 329082, 400913, 264_000};
        double averageAmountSpent = 0;
        for (int currentValue : monthlyExpenses) {
            averageAmountSpent += currentValue;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageAmountSpent / 4 + " рублей");
        System.out.println();

        //Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char [] copyReverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < copyReverseFullName.length; i++) {
            reverseFullName [reverseFullName.length - 1 - i] = copyReverseFullName [i];
        }
        System.out.println(Arrays.toString(reverseFullName));
    }
}
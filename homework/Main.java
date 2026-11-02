import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите начальную дистанцию (км): ");
        double startDist = sc.nextDouble();

        System.out.println("Часть 1: план подготовки");
        double dist = startDist;
        int weeks = 0;

        while (dist < 42.0) {
            weeks++;
            dist = dist * 1.05;
            System.out.print("Неделя " + weeks + ": ");
            System.out.printf("%.2f", dist);
            System.out.println(" км");
        }
        System.out.println("Итоговое число недель: " + weeks);

        System.out.println("\nЧасть 2: суммарный километраж");
        double total = 0.0;
        double currentWeekDist = startDist;

        for (int week = 1; week <= 6; week++) {
            total += currentWeekDist;
            System.out.print("Неделя " + week + ": ");
            System.out.printf("%.2f", currentWeekDist);
            System.out.println(" км");
            currentWeekDist += 2.0;
        }

        System.out.print("Суммарный километраж за 6 недель: ");
        System.out.printf("%.2f", total);
        System.out.println(" км");

        sc.close();
    }
}
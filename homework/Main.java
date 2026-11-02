import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int studentCount = 6;

        System.out.println("=== Часть 1: Оценки по математике ===");
        int[] mathGrades = new int[studentCount];
        int sumPart1 = 0;
        int goodGradesPart1 = 0;

        System.out.println("Введите 6 оценок по математике:");
        for (int i = 0; i < studentCount; i++) {
            mathGrades[i] = scanner.nextInt();
            sumPart1 += mathGrades[i];
            if (mathGrades[i] >= 4) {
                goodGradesPart1++;
            }
        }

        System.out.print("Оценки: ");
        for (int i = 0; i < studentCount; i++) {
            System.out.print(mathGrades[i] + (i < studentCount - 1 ? " " : ""));
        }
        System.out.println();

        double avgPart1 = (double) sumPart1 / studentCount;
        System.out.printf("Средний балл: %.2f%n", avgPart1);
        System.out.println("Количество оценок 4 и 5: " + goodGradesPart1);
        System.out.println();

        System.out.println("=== Часть 2: Математика и Физика ===");
        int subjectCount = 2;
        int[][] journal = new int[subjectCount][studentCount];
        String[] subjects = {"Математика", "Физика"};

        for (int i = 0; i < subjectCount; i++) {
            System.out.println("Введите 6 оценок (" + subjects[i] + "):");
            for (int j = 0; j < studentCount; j++) {
                journal[i][j] = scanner.nextInt();
            }
        }

        double[] averages = new double[subjectCount];
        int[] goodGrades = new int[subjectCount];
        int[] badGrades = new int[subjectCount];

        for (int i = 0; i < subjectCount; i++) {
            int currentSum = 0;
            for (int j = 0; j < studentCount; j++) {
                int grade = journal[i][j];
                currentSum += grade;

                if (grade >= 4) {
                    goodGrades[i]++;
                }
                if (grade == 2) {
                    badGrades[i]++;
                }
            }
            averages[i] = (double) currentSum / studentCount;
        }

        System.out.println("\nСводка:");
        for (int i = 0; i < subjectCount; i++) {
            System.out.printf("%s: средний балл %.2f, оценок 4-5: %d, учеников с двойкой: %d%n",
                    subjects[i], averages[i], goodGrades[i], badGrades[i]);
        }

        if (averages[0] > averages[1]) {
            System.out.println("Выше по среднему: математика");
        } else if (averages[1] > averages[0]) {
            System.out.println("Выше по среднему: физика");
        } else {
            System.out.println("Выше по среднему: баллы равны");
        }
    }
}
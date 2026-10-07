import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("доход за месяц: ");
        double inc = in.nextDouble();

        System.out.print("траты на еду: ");
        int food = in.nextInt();

        System.out.print("траты на транспорт: ");
        int trans = in.nextInt();

        System.out.print("траты на развлечения: ");
        int fun = in.nextInt();

        // складываем три статьи расходов
        int rashod = food + trans + fun;

        // вычитаем расходы из месячного дохода
        double ost = inc - rashod;

        // делим сумму расходов на 30 дней месяца
        double day = (double) rashod / 30;

        // делим накопленный остаток на ежемесячные траты
        int mes = (int) (ost / rashod);

        System.out.println("итоги расчета:");
        System.out.println("всего расходов: " + rashod);
        System.out.print("остаток: ");
        System.out.printf("%.2f", ost);
        System.out.println();
        System.out.print("расход в день: ");
        System.out.printf("%.2f", day);
        System.out.println();
        System.out.println("хватит на месяцев: " + mes);
    }
}

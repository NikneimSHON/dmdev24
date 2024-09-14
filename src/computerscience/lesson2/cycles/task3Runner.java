package computerscience.lesson2.cycles;

/**
 * Задание 3
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */
public class task3Runner {
    public static void main(String[] args) {
        double brokerMoney = investmentCalculation(20, 2);
        System.out.println("Количество денег за брокерском счету за 3 года и 2 месяца = " + brokerMoney);
        double personalMoney = moneyCalculation(20);
        System.out.println("Количество денег за своём счету за 3 года и 2 месяца = " + personalMoney);


    }

    private static double moneyCalculation(int month) {
        double money = 0;
        for (int currentMonth = 1; currentMonth <= month; currentMonth++) {
            money += salaryCalculate(currentMonth) * 0.9;
            money -= 300;
        }
        return money;
    }

    private static double investmentCalculation(int month, int percent) {
        double brokerMoney = 0;
        for (int currentMonth = 1; currentMonth <= month; currentMonth++) {
            int salary = salaryCalculate(currentMonth);
            brokerMoney += (salary * 0.1 + salary * 0.1 / 100 * percent);
        }
        return brokerMoney;
    }

    private static int salaryCalculate(int month) {
        int salary = 600;
        for (int currentMonth = 1; currentMonth <= month; currentMonth++) {
            if (currentMonth % 6 == 0) {
                salary += 400;
            }
        }

        return salary;
    }


}

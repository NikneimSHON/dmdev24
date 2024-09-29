package javacore.lesson2.tack1;

/**
 * Задание 1
 * Создать класс, описывающий банкомат.
 * Банкомат задается тремя свойствами:
 * - количеством купюр номиналом 10, 20 и 50.
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 * Сделать методы для добавления денег в банкомат.
 * Сделать метод, снимающий деньги: он принимает сумму денег, а возвращает булево значение - успешность выполнения операции.
 * При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма.
 * Сначала банкомат будет пытаться рассчитаться 50, далее добавит недостающие 20,
 * и только затем 10 (не нужно рассматривать более сложные варианты выдачи наличных, чтобы не усложнять алгоритм).
 */
public class CashPointRunner {
    public static void main(String[] args) {
        CashPoint cashPoint = new CashPoint(0, 0, 0);
        cashPoint.depositMoney(100);
        cashPoint.depositMoney(1);
        cashPoint.withdrawMoney(8);
        cashPoint.withdrawMoney(50);
        cashPoint.depositMoney(300);
        cashPoint.withdrawMoney(400);
        cashPoint.depositMoney(1030);
        System.out.println(cashPoint);
    }
}

public class Main {
    public static void main(String[] args) {

        int startSum = 100; // начальная сумма
        int income = 1100; // сумма пополнения

        int bonus = 0; // переменная бонуса
        int total = 0; // переменая итоговой суммы

        if (income > 1000) {

            bonus = (income / 100);
            total = startSum + income + bonus;

        } else {
            total = startSum + income;
        }
        System.out.println("Итоговая сумма" + total);
        System.out.println("Сумма бонуса" + bonus);
    }
}



public class Main {
    public static void main(String[] args) {

        int initialBill = 100;
        int amountDeposit = 1100;
        int bill = initialBill + amountDeposit;
        int oneBonus = 100;
        int bonus;
        if (amountDeposit > 1000) {
            bonus = amountDeposit / oneBonus;
        } else {
            bonus = 0;
        }
        int totalBill = bill + bonus;

        System.out.println("Итоговый счет: " + totalBill);
        System.out.println("Бонусные рубли: " + bonus);
    }
}

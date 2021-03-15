public class Main {
    public static void main(String[] args) {
        int balance = -100_000;
        int reFill = 100_000;
        int bonusPay = reFill / 100;
        if (reFill < 1000) {
            System.out.println("Балланс Вашего лицевого счета составляет: " + (balance + reFill) + " руб.");
        } else {
            System.out.println("Балланс Вашего лицевого счета составляет: " + (balance + reFill + bonusPay) + " руб." + " Ваш бонус за последний платеж составил: " + bonusPay + " руб.");

        }
    }
}

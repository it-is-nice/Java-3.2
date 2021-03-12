public class Main {
    public static void main(String[] args) {
        int balance = 10000;
        int refill = 1;
        int bonus = refill/100;
        if (refill < 1000)
        {
            System.out.println("Балланс Вашего лицевого счета составляет: " +  (balance+refill) + " руб.");
        }
        else
        {
            System.out.println( "Балланс Вашего лицевого счета составляет: " +  (balance+refill+bonus) + " руб." + " Ваш бонус за последний платеж составил: " + bonus + " руб.");

        }
    }
}

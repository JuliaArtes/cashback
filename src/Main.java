public class Main {
    public static void main(String[] args) {
        int amountInRegular = 100;
        int amountInHigh = 1000;
        int amointInSpecial = 10000;

        int percentIRegular = 1;
        int percentInHigh = 5;
        int percentInSpecial = 30;

        int result = (amountInRegular * percentIRegular + amountInHigh * percentInHigh + amointInSpecial * percentInSpecial) / 100;
        int cashback;
        int cashbacklimit = 3000;
        if (result> cashbacklimit) {
           cashback= cashbacklimit;
        } else {
            cashback = result;
        }
        System.out.println(cashback);
    }
}

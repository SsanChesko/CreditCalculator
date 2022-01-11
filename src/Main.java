public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int payment = (int) service.calculate(1_000_000,9.99,12);
        int payment1 = (int) service.calculate(1_000_000,9.99,24);
        int payment2 = (int) service.calculate(1_000_000,9.99,36);
        System.out.println("Ваш ежемесячный платеж составит - " + payment + " рублей(я).");
        System.out.println("Ваш ежемесячный платеж составит - " + payment1 + " рублей(я).");
        System.out.println("Ваш ежемесячный платеж составит - " + payment2 + " рублей(я).");
    }
}

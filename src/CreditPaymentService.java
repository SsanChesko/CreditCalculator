public class CreditPaymentService {
    public double calculate (int amount, double creditRate, int months) { // Сумма кредита, процентная ставка, месяцы
        /* Формула аннуитетного платежа:
        P = S * (r * (1+r)^n) / (1+r)^n - 1
        P - аннуитетный платеж;
        S - запрашиваемая сумма займа
        r - процентная ставка (в месяц)
        n - срок кредита в месяцах
         */
        double creditRatePerMonth = (creditRate / 100) / 12; // Указана годовая ставка, для формулы необходима ставка по месяцам
        double square = Math.pow(1 + creditRatePerMonth, months); // (1+r)^n
        double payment = amount * (creditRatePerMonth * square) / (square - 1); // Формула аннуитетного платежа
        return payment;
    }
}

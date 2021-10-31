public class CreditPaymentService {
    public double calculate(double percent, double amount, int month) {
        double monthlyPercentage = percent / 12 / 100;
        double x = Math.pow(1 + monthlyPercentage, month);
        double factor = monthlyPercentage + (monthlyPercentage / (x - 1));
        double monthlyPayment = factor * amount;

        return monthlyPayment;
    }
}

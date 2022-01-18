public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit = 1_000_000;
        double Year1 = 1;
        double percent = 0.0999;
        double Year2 = 2;
        double Year3 = 3;


        double PaymentForMonth = service.calculate(credit, Year1, percent);
        System.out.println(PaymentForMonth);

        PaymentForMonth = service.calculate(credit, Year2, percent);
        System.out.println(PaymentForMonth);

        PaymentForMonth = service.calculate(credit, Year3, percent);
        System.out.println(PaymentForMonth);

    }

}



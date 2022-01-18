public class CreditPaymentService {
    double credit;
    double Year;
    double payment;
    double months = 12;
    double percent;
    double time;
    double ONE = 1;
    double equation;

 /*

    double hooks;
    double first;
    double second;

   public double calculate(double credit, double Year, double percent) {
        time = Year * months;
       percent = percent / months;
        hooks = ONE + percent;
        equation = Math.pow(hooks, time);
       first = (percent * equation);
       second = equation - ONE;
       payment = credit * (first/second);

        return payment;
    }

    */

    public double calculate(double credit,double Year,double percent) {

        time = Year * months;
        percent = percent / months;
        equation = Math.pow(ONE + percent, time);
        payment = credit * ((percent * equation)/ (equation - ONE));
return payment;
    }

        }

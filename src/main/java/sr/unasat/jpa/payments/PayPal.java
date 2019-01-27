package sr.unasat.jpa.payments;

public class PayPal extends Payment{
    double fee = 5;

    public PayPal() {
    }

    @Override
    void showWelcomeMessage() {
        System.out.println("Thank you for choosing PayPal");
    }

    @Override
    void showFeeMessage() {
        System.out.println("The fee is " + fee + "%");

    }
}

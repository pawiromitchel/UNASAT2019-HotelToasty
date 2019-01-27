package sr.unasat.jpa.payments;

public abstract class Payment {
    double fee;

    Payment(){}

    public boolean pay(){
        showWelcomeMessage();
        showFeeMessage();
        return false;
    }

    abstract void showWelcomeMessage();
    abstract void showFeeMessage();
}

package sr.unasat.jpa.builders;

public class RoomBuilder implements Builder{
    private boolean massage;

    @Override
    public void setMassage(boolean massage) {
        this.massage = massage;
    }
}

package tache2;

public class Banana extends Fruit{
    public Banana(String origin) {
        super(origin);
    }

    @Override
    public java.lang.String toString() {
        return "Banana " + getOrigin() + " " + getValue()/100.0;
    }
}

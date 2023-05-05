package tache2;

public class Orange extends Fruit{


    public Orange(String origin, long value) {
        super(origin, value);
    }

    public Orange(String origin, long value, int pepins) throws IllegalArgumentException {
        super(origin, value, pepins);
    }

    @Override
    public java.lang.String toString() {
        return "Orange " + getOrigin() + " " + getValue()/100.0;
    }

}
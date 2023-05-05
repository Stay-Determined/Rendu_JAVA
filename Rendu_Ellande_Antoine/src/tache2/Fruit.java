package tache2;

public class Fruit
{
    public long value;
    private String origin;
    private int seedsLevel = 0;


    public Fruit(String origin) {
        this.value = 100;
        this.origin = origin;
    }

    public Fruit(String origin, long value ) {
        this.value = value;
        this.origin = origin;
    }

    public Fruit(String origin, long value, int pepins) throws IllegalArgumentException {
        this.value = value;
        this.origin = origin;
        if(value - pepins*0.05 <= value/2){
            throw new IllegalArgumentException("Le niveau de pépins ne peut pas être réduit de plus de la moitié de sa valeur par défaut");

        }else {
            this.seedsLevel = pepins;
        }
    }

    public long getValue() {
        return (this.value - seedsLevel*5);
    }

    public int getSeedsLevel() {
        return this.seedsLevel;
    }

    protected String getOrigin() {
        return this.origin;
    }

    public boolean equals (Fruit f){
        if(this.value == f.value && this.origin == f.origin && this.seedsLevel == f.seedsLevel) {
            return true;
        } else {
            return false;
        }
    }

    public void setValue(long value) {
        this.value = value;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}

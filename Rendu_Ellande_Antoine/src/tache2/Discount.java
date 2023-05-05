package tache2;

public class Discount extends Fruit{
    private Fruit fruit;
    private Ticket ticket;


    public Discount(Fruit fruit, Ticket ticket)  {
        super(fruit.getOrigin(), fruit.getValue(), fruit.getSeedsLevel());
        fruit = new Fruit(fruit.getOrigin(), fruit.getValue());
            this.fruit = fruit;
            this.ticket = ticket;
    }

    @Override
    public String toString() {
        return fruit.toString() + " discount";
    }
}

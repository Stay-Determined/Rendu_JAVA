package tache2;

import java.util.ArrayList;


public class Basket {
    private ArrayList<Fruit> basket;
    private int id;
    private static int count = 0;


    public Basket() {
        this.basket = new ArrayList<>();
        this.id = count++;
    }

    public void addFruit (Fruit fruit){
        basket.add(fruit);
    }

    public void addFruit (Fruit fruit, Ticket ticket){
        Discount discount;
        if (ticket != null){
            discount = new Discount(fruit, ticket);
            basket.add(discount);
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Basket id - ").append(this.id).append(" - [\n");
        for (Fruit fruit : this.basket) {
            sb.append(fruit.toString()).append("\n");
        }
        sb.append("]");
        return sb.toString();
    }

    public long totalBasket(){
        long total = 0;
        for (Fruit fruit: this.basket) {
            total += fruit.getValue();
        }
        return total;
    }

    public void displayTotal(){
        System.out.println(totalBasket()/100.0);
    }

    void boycottOrigin(String country){
        for(Fruit fruit: this.basket) {
            if(fruit.getOrigin() == country){
                this.basket.remove(fruit);
            }
        }
    }

}

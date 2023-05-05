package tache2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Affichage des orange");
        Orange a = new Orange("France",80, 1);
        // au premier test, la fonction enverra une erreur car trop de pépins sont entrés.
        // changer la valeur des pépins entre 0 et 8 pour que la fonction continue au 2 eme Test
        Orange b = new Orange("Espagne",90, 8);
        Orange c = new Orange("Espagne",90,  8);
        Orange d = a;
        System.out.println(c);

        System.out.println("Affichage des bananes");
        Banana e = new Banana("Espagne");
        Banana f = new Banana("France");
        Banana g = new Banana("Mexique");

        System.out.println("Affichage d");
        Basket w = new Basket();
        w.addFruit(d);
        w.addFruit(a);
        w.addFruit(b);

        Basket z = new Basket();
        z.addFruit(f);
        z.addFruit(g);
        System.out.println(w.toString());
        System.out.println(z.toString());

        w.displayTotal();

        Banana h = new Banana("Mexique");
        Ticket ticket = new Ticket(50);
        Basket y = new Basket();
        y.addFruit(h, ticket);
        y.addFruit(g, ticket);
        y.addFruit(a, ticket);
        y.addFruit(e, ticket);

        System.out.println(y.toString());

        y.displayTotal();
        y.boycottOrigin("Mexique");
        System.out.println("Boycott Mexique");

        y.displayTotal();

    }
}
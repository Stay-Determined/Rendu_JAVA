package tache1;

public class Node {
    private Node previous;
    private int value;
    private Node next;

    // création du dernier
    public Node(int value) {
        this.previous = null;
        this.value = value;
        this.next = null;
    }

    // création d'un node Tampon
    public Node(Node temp) {
        this.previous = temp.previous;
        this.value = temp.value;
        this.next = temp.next;
    }

    // ajout d'un node au début
    public Node(Node prev, int value, Node node) {
        this.previous = prev;
        this.value = value;
        this.next = node;
    }

    public Node getPrevious() {
        return previous;
    }

    // récupération de la valeur d'un node
    public int getValue() {
        return value;
    }

    // récupération du node suivant
    public Node getNext() {
        return next;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

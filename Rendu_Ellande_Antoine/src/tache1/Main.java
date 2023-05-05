package tache1;

public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList(1);
        myList.addLast(2);
        myList.addFirst(3);
        myList.addFirst(4);
        System.out.println(myList.indexOf(3));
        System.out.println(myList.contains(2));
        myList.deleteFirst();
        myList.deleteLast();
        System.out.println(myList.indexOf(4));
        System.out.println(myList.contains(2));
    }
}
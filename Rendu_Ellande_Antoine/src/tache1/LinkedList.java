package tache1;

import javax.management.StandardMBean;

public class LinkedList {
    private Node first; //can be called head
    private Node last; //can be called tail

    public LinkedList(int i) {
        this.first = new Node(i);
        this.last = first;
    }

    public void addFirst(int test) {
        Node myNode = first;
        Node tampon = new Node(null, test, myNode);
        first = tampon;
        if (myNode == null){
            last = tampon;
        } else {
            myNode.setPrevious(tampon);
        }
    }

    public void addLast(int test) {
        Node myNode = last;
        Node tampon = new Node(myNode, test, null);
        last = tampon;
        if(myNode == null){
            first = tampon;
        } else {
            myNode.setNext(tampon);
        }
    }

    public void deleteFirst() {
        Node delete = first;
        first = delete.getNext();
        first.setPrevious(null);
        if(delete == null){
            last = null;
        } else {
            delete.setPrevious(null);
        }
    }

    public void deleteLast() {
        Node delete = last;
        last = delete.getPrevious();
        last.setNext(null);
        if (delete.getPrevious() == null){
            first = null;
        } else {
            delete.setNext(null);
        }
    }

    public boolean contains(int search) {
        Node myNode = new Node(first);
        while (myNode.getNext() != null) {
            if (myNode.getValue() == search) {
                return true;
            } else {
                myNode = myNode.getNext();
            }
        }
        if (myNode.getValue() == search) {
            return true;
        } else {
            return false;
        }
    }

   public int indexOf(int value){
        Node myNode = new Node(first);
        for (int i = 1;myNode.getNext()!=null; i++){
            if(myNode.getValue()==value){
                return i;
            }else{
                myNode = myNode.getNext();
            }
        }
        return -1;
    }
}
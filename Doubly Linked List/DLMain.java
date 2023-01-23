package com.company;

public class DLMain {
    public static void main(String[] args) {
        DoublyLinkedList d=new DoublyLinkedList();
        d.insertatbegin(1);
        d.insertatbegin(2);
        d.insertatbegin(3);
        d.insertatbegin(4);
        d.insertatbegin(5);
//d.insertparicularpos(2,8);
        d.display();
        d.insertatend(5);
        d.insertatend(6);
        d.insertatend(7);

        d.display();
    }
}

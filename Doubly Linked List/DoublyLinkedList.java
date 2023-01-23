package com.company;

public class DoublyLinkedList {
    Node head;
    Node tail;
    class Node
    {
        int data;
        Node next;
        Node prev;
        Node tail;
        Node(int val)
        {
            data=val;next=null;prev=null;
        }
    }
    DoublyLinkedList()
    {
        head=null;tail=null;
    }
    void insertatbegin(int val)
    {
        Node newnode=new Node(val);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        else
        {
            head.prev=newnode;
           newnode.next= head;
           head=newnode;
        }
    }
//    void insertparicularpos(int pos,int val) {
//        Node n = new Node(val);
//        Node t = head;
//        if (pos == 1) {
//            insertatend(val);
//        } else {
//            for (int i = 1; i < pos; i++) {
//                n.next = t.next;
//                n.prev = t;
//                t.next = n;
//                t.next.prev = n;
//
//            }
//        }
//    }
    void insertatend(int val)
    {
        Node newnode=new Node(val);

        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        else
        {
            newnode.prev=tail.next;
            tail.next=newnode;
            tail=newnode;
            tail.next=null;
        }
    }

    void display()
    {
        Node tem=head;
        while(tem!=null)
        {
            System.out.print(tem.data+" ");
            tem=tem.next;
        }
        System.out.println(" ");
    }
}

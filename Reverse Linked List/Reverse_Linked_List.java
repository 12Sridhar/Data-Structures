package com.company;

public class Reverse_Linked_List {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    Reverse_Linked_List() {
        head = null;
    }
    int count=0;
    void insert(int val) {
        Node rn = new Node(val);
        if(head==null)
        {
            head=rn;
        }
        else
        {
             Node last=head;
             while(last.next!=null)
             {

                 last=last.next;

             }
             last.next=rn;
        }
    }

    void reverse()
    {
        Node prev=null;
        Node current=head;
        Node next=head.next;
        while(current!=null)
        {
         next=current.next;
         current.next=prev;
         prev=current;
         current=next;
        }
        head=prev;
    }
    void display()
    {
        Node d=head;
        while(d!=null)
        {

            System.out.println(d.data+" ");
            d=d.next;
        }
    }
}

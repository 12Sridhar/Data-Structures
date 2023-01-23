package com.company;

public class Floydscycledetection {
    Node head;
    public static class Node
    {
        int data;
        Node next;
        Node(int val)
        {
            data=val;
            next=null;
        }
    }
    Floydscycledetection()
    {
        head=null;
    }
    void insertatend(int val) {
        Node n = new Node(val);
        Node last = head;
        Node d = head;
        if (head == null) {
            head = n;
        } else {
            last.next = n;
            last = n;
        }
        for(int i=0;i<5;i++)
        {
            d=d.next;
        }
        n.next=d.next;

    }
    int detection() {
        Node tortoise = head;
        Node rabbit = head;
        while (rabbit != null && rabbit.next != null) {
            tortoise = tortoise.next;
            rabbit = rabbit.next.next;
            if (tortoise == rabbit)
                return rabbit.data;
        }
return 0;
    }

}

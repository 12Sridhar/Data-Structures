package com.company;

public class complete_LinkedList {
    Node head;
   public class Node
    {
        int data;
        Node next;
        Node(int val)
        {
            data=val;
            next=null;
        }
    }
    complete_LinkedList()
    {
        head=null;
    }
    int ct=0;
    void insertatbegin(int val)
    {
        ct++;
        Node n=new Node(val);
        if(head==null)
        {
            head=n;
        }
        else
        {
           n.next=head;
           head=n;
        }
    }
    int count=0;
   public void insertatend(int val) {
        count++;
        Node n = new Node(val);
        if (head == null) {
            head = n;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = n;
        }

    }
    void reverse()
    {
        Node pre=null;
        Node current=head;
        Node next=head.next;
        while(current!=null)
        {
            next=current.next;
            current.next=pre;
            pre=current;
            current=next;
        }head=pre;
    }
        void display(){
        Node d1=head;
            Node d=head;
            while(d!=null)
            {
                System.out.println(d.data+" ");
                d=d.next;
                if(d.next==null)
                {
                  //  d.next=d1;
                }
            }
        }
        void length()
        {
            if(count>0)
            System.out.println(count);
            if(count>0)
            System.out.println(ct);
        }
        void insertpos(int pos ,int val) {
            Node n = new Node(val);
            Node d1 = head;
            if (pos == 1) {
                insertatbegin(val);
            } else {
                for (int i = 1; i < pos; i++) {
                    d1 = d1.next;
                }
                n.next = d1.next;
                d1.next = n;
            }
        }
        void deletepos(int pos)
        {
            if(pos==1)
            {
                head=head.next;
            }
            else
            {
                Node t=head;
                Node prev=null;
                for(int i=1;i<=pos;i++)
                {
                   prev= t;
                   t=t.next;
                }
                prev.next=t.next;
            }
        }
    void reverse1()
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

    }

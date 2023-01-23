package com.company;

public class FLMain {
    public static void main(String[] args) {
        Floydscycledetection f=new Floydscycledetection();
        f.insertatend(1);
        f.insertatend(2);
        f.insertatend(3);
        f.insertatend(4);
        f.insertatend(5);
        f.insertatend(6);
        f.insertatend(7);
        f.insertatend(8);
        System.out.println( f.detection());
    }
}

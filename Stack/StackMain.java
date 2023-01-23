package com.company;

public class StackMain {
    public static void main(String[] args) {
        stack s=new stack();
        for(int i=1;i<=11;i++)
        {
            s.push(i);
        }
        for(int i=10;i>0;i--)
        {
            System.out.println(s.pop());
        }
    }
}

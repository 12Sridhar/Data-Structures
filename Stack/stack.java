package com.company;

public class stack {
    int[] s = new int[10];
    int tos = -1;

    void push(int val) {
        if (tos ==9) {
            s[++tos] = val;
        } else {
            System.out.println("Stack is full");
        }
    }

    int pop() {
        if (tos >= 0) {
            return s[tos--];
        } else {
            System.out.println("Stack is empty");
        }
        return -1;
    }
}

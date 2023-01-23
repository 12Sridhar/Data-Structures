package com.company;

import java.util.Arrays;

public class Arrays_module {
   static int capacity = 10;
   static int[] a = new int[capacity];
   static int size = 0;

    static void insert_element(int val) {
        if (size == capacity) {
            expand();
        }
        a[size++]=val;
    }
   static void expand()
    {
        capacity*=2;
                a= Arrays.copyOf(a,capacity);
    }
    static void display()
    {
        for (int i=0;i<size;i++)
        {
            System.out.print(a[i]);
        }
    }
    static void insrt_pos(int pos,int val)
    {
        for(int i=size;i>=pos;i--)
        {
            a[i+1]=a[i];
        }
        a[pos]=val;
        size++;
    }
    static void delete_pos(int pos)
    {
        for(int i=0;i<size;i++)
        {
            if(i==pos-1)
            {
                continue;
            }
            else
            {
                System.out.println(a[i]);
            }
        }
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("INSERT ELEMENTS PRESS 1");
        System.out.println("DISPLAY ELEMENTS PRESS 2");
        System.out.println("INSERT SPECIFIC POSITION PRESS 3");
        System.out.println("DELETE SPECIFIC POSITION PRESS 4");
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.println("ENTER NUMER");
            int n= sc.nextInt();
            switch (n) {

                case 1:
                    System.out.println("Enter Element");
                    int val=sc.nextInt();
                    Arrays_module.insert_element(val);
                    break;
                case 2 : Arrays_module.display();
                break;
                case 3 :
                    System.out.println("Enter position and value");
                    int pos = sc.nextInt();
                    int va = sc.nextInt();
                    Arrays_module.insrt_pos(pos, va);
                break;
                case 4 :
                    System.out.println("Enter position");
                    int pos1 = sc.nextInt();
                    Arrays_module.delete_pos(pos1);
                break;
            }
        }
    }
}

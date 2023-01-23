package com.company;

import java.util.Scanner;

public class CLMain {
    public static void main(String[] args) {
        complete_LinkedList cl=new complete_LinkedList();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("ENTER 1 FOR INSERT AT END");
            System.out.println("ENTER 2 FOR INSERT AT BEG");
            System.out.println("ENTER 3 FOR INSERT AT REV");
            System.out.println("ENTER 4 FOR LENGTH");
            System.out.println("ENTER 5 FOR INSERT SPEC POSITION");
            System.out.println("ENTER 6 FOR DELETE PARTICULAR POSITION");
            System.out.println("ENTER 7 FOR DISPLAY");
            int n=sc.nextInt();
            switch(n)
            {
                case 1:
                    cl.insertatend(sc.nextInt());
                    break;
                case 2:
                    cl.insertatbegin(sc.nextInt());
                    break;
                case 3:
                    cl.reverse1();
                    break;
                case 4:
                    cl.length();
                    break;
                case 5:
                    System.out.print("ENTER POS & VALUE");
                    cl.insertpos(sc.nextInt(), sc.nextInt());
                    break;
                case 6:
                    System.out.println("ENTER POS");
                    cl.deletepos(sc.nextInt());
                    break;
                case 7:
                    cl.display();
                    break;
            }
        }

    }
}

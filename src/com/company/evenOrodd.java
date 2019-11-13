package com.company;
import java.util.Scanner;

public class evenOrodd {

        public void evenOrodd() {
            Scanner reader1 = new Scanner(System.in);

            System.out.print("Please enter a number:");
            int x = reader1.nextInt();

            if (x % 2 == 0) {
                System.out.println(x+" "+"is even number");
            } else {
                System.out.println(x +" "+"is odd number");

            }
        }
    }



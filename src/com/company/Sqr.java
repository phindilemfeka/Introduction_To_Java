package com.company;
import java.util.Scanner;

public class Sqr {
    public void Square() {
        Scanner reader2 = new Scanner(System.in);

        System.out.print("Please enter an integer:");
        int x = reader2.nextInt();

        for (int y = 1; y <= x; y++) {
            for (int z = 1; z <= x; z++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
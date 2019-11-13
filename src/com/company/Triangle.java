package com.company;
import java.util.Scanner;

public class Triangle {

    public void Triangle() {
        Scanner reader3 = new Scanner(System.in);

        System.out.print("Please enter an integer:");
        int x = reader3.nextInt();

        for (int y = 1; y <= x; y++) {
            for (int z = 1; z <= y; z++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
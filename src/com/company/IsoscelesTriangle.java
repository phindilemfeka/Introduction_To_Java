package com.company;
import java.util.Scanner;

public class IsoscelesTriangle {

    public void IsoscelesTriangle() {
        Scanner reader4 = new Scanner(System.in);

        System.out.print("Please enter an integer:");
        int x = reader4.nextInt();


        for (int y = 1; y <= x; y++)
        {

            for (int z = x; z > y; --z)
            {
                System.out.print(" ");
            }
            for (int v = 1; v < (y * 2); v++)
                {
                    System.out.print("#");
                }
                System.out.println("");
            }
        }
    }


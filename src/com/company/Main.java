package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

	Hello objHello = new Hello();
	objHello.greeting();

	evenOrodd objevenOrodd = new evenOrodd();
	objevenOrodd.evenOrodd();

	Sqr objSqr = new Sqr();
	objSqr.Square();

	Triangle objTriangle = new Triangle();
	objTriangle.Triangle();


	IsoscelesTriangle objIT = new IsoscelesTriangle();
	objIT.IsoscelesTriangle();

    }
}
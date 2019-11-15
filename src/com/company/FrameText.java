package com.company;

public class FrameText {
    public void FrameSomeText() {

        String[] inputs = {"Write","good","code","every","day","j"};
        System.out.print("*");
        int maxsize = 0;
        for (String s : inputs) {
            if (s.length() > maxsize) {
                maxsize = s.length();
            }
        }
        for (int i = 0; i <= maxsize + 1; i++) {
            System.out.print("*");
        }
        System.out.print("*");
        System.out.println();
        for (int k = 0; k < inputs.length; k++) {
            System.out.print("* " + inputs[k]);
            for (int i = inputs[k].length(); i <= maxsize-1; i++) {
                System.out.print(" ");
            }
            System.out.print(" *");
            System.out.println();
        }System.out.print("*");

        for (int i = 0; i <= maxsize + 1; i++) {
            System.out.print("*");
        }
        System.out.print("*");
    }
}
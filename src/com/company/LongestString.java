package com.company;

public class LongestString {
    public void FindLongestString() {

        String[] names = {"the", "quick", "brown", "fox", "ate", "my", "chickens"};
        String Firstname = names[0];

        for (int i = 1; i < Firstname.length(); i++) {
            if (names[1].length() > Firstname.length()) ;
            {
                Firstname = names[i];
            }
    }
        for (int j=0;j<names.length;j++)
        {
            if (names[j].length() == Firstname.length()) {
                System.out.println(names[j]);
            }
        }

    }

}
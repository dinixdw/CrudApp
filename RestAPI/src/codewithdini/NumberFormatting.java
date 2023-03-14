package codewithdini;

import java.text.NumberFormat;

public class NumberFormatting {
    public static void main(String[] args) {

    NumberFormat currency= NumberFormat.getCurrencyInstance();
    String Result = currency.format(45625);
        System.out.println(Result);

        NumberFormat percent= NumberFormat.getPercentInstance();
        String Answer= percent.format(0.45);
        System.out.println(Answer);


        String yet=  NumberFormat.getPercentInstance().format(5626);
        System.out.println(yet);

        String go= NumberFormat.getCurrencyInstance().format(2345);
        System.out.println(go);
    }
}

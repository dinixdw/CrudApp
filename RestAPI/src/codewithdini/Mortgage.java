package codewithdini;

import java.security.Principal;
import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {
    final Byte MONTHS_IN_YEAR=12;
    final Byte PERCENT = 100;

    Scanner scanner=new Scanner(System.in);
        System.out.println("Principal:");
    int principal = scanner.nextInt();

        System.out.println("Annual Interest Rate:");
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterest= (annualInterestRate / PERCENT)* MONTHS_IN_YEAR;

        System.out.println("Time Period"+ " " +("Years:"));
        Byte years= scanner.nextByte();
        int numberOfPayments = years*MONTHS_IN_YEAR;

        double mortgage= principal
                *monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayments) /
                (Math.pow(1+monthlyInterest,numberOfPayments)-1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage:" + mortgageFormatted);


    }
}

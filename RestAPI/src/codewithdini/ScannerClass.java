package codewithdini;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner pp=new Scanner(System.in);
        System.out.println("Welcome to Glam by Dinix!! What is Your name" );
        String name = pp.nextLine();


        System.out.println(" Welcome," + name);

        int age= pp.nextInt();
        System.out.println("Please enter your age");

        System.out.println("Thank You, Your " + age + "Years Old");
    }
}

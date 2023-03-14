package codewithdini;

import java.awt.*;
import java.util.Date;


public class Main {

    public static void main(String[] args) {
        int myAge=30;
        int herAge= myAge;
        long viewCount= 3_123_456_789L;
        Point p1=new Point(8,8);
        Point p2=p1;
        p1.x=6;
        System.out.println(p2);

        Date now=new Date();
        System.out.println(now);
        System.out.println(herAge);

        String message= "  Hello World!!  ";

        System.out.println(message.trim());







    }
}
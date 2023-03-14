package codewithdini;

public class Casting {
    public static void main(String[] args) {
        /*double x=1.1;
        double y= x+2;
        System.out.println(y);
        // this is called implicit casting and this get converted automatically.

        double x=1.1;
        int y= (int)x+2; //this is called explicit casting where you  convert it to int */

       String x = "1.1";
       Double y= Double.parseDouble(x)+2;
        System.out.println(y);

    }
}

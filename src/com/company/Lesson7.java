package com.company;

public class Lesson7 {
    public static void main(String[] args) {
        int x = 54;
        System.out.println(Math.sqrt(x));
        double result = Math.sqrt(65);
        double powered = Math.pow(x,2.1);
        System.out.println(powered);

        double area = 3.142 * Math.pow(7,2); //same as 7*7
        System.out.println(area);
        System.out.println(11/5.0);

        powered = Math.round(powered);
        System.out.println(powered);
        int z = (int)powered;
        System.out.println(z);//conversion of a double to an integer, conversion type casting

        String y = "10";
        int v = Integer.parseInt(y);//conversion of a string into an integer
        String k = "12.66";
        double s =Double.parseDouble(k);//conversion of a string into an double
        int xy=10;
        String t =xy+""; //join with another string
        String r =String.valueOf(xy); //conversion of an integer into a string
        System.out.println(t);
    }
}

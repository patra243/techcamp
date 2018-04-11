package com.company;


import java.util.Scanner;
public class Lesson10 {
    public void areaOfCircle(double radius) {
        double result = 22 / 7.0 * radius * radius;
        System.out.println(result);
    }

    public static void main(String[] args) {

        Lesson10 lesson=new Lesson10();
        lesson.areaOfCircle( 7.7);
        lesson.areaOfCircle( 54);
        lesson.areaOfCircle(67);





        /*Scanner s= new Scanner(System.in); // initialize construct object
        System.out.println("Enter First Number: ");
        int a = s.nextInt();
        System.out.println("Enter Second Number: ");
        int b = s.nextInt();
        int result = a + b;
        System.out.println("The sum is "+result);

        System.out.println("Enter Your Name: ");
        String name = s.nextLine();
        System.out.println("Your name is "+name.toUpperCase());*/
    }
}


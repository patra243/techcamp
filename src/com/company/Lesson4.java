package com.company;

public class Lesson4 {
    public static void main(String[] args) {
        double w = 71.4;
        double h = 4.6;
        double result = w/(h*h);
        System.out.println(result);
        //conditional statement
        if(result<15)
        {
            System.out.println("very severely underweight");
        }
        else if(result>=15 && result<16)
        {
            System.out.println("Severely underweight");
        }
        else if(result>=16 && result<18.5)
        {
            System.out.println("Underweight");
        }
        else if(result>=18.5 && result<25)
        {
            System.out.println("Normal");
        }
        else if(result>=25 && result<30)
        {
            System.out.println("Overweight");
        }
        else if(result>=30 && result<35)
        {
            System.out.println("Obese class 1(Moderately obese");
        }
        else if(result>=35 && result<40)
        {
            System.out.println("Obese class 2.0(Severely obese ll)");
        }
        else
        {
            System.out.println("Obese class 3(Very severely obese)");
        }
    }
}

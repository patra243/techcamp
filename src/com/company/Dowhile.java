package com.company;

public class Dowhile {
    public static void main(String[] args) {
        int i=1;
        int j=100;
        do {
            j += i;
            i++;
        }while(i<=100);
        System.out.println("sum is "+i);
    }
}

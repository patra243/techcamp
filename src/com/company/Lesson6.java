package com.company;

public class Lesson6 {
    public static void main(String[] args) {
        //text
        String fname = "John";
        String lname = "Mark";
        String regNumber = "001";
        System.out.println(fname +" "+ lname +" "+ regNumber);
        String fullNames = fname+" "+lname;
        System.out.println(fullNames);
        String sentence = "The quick brown fox jumped over a lazy dog";
        //methods or functions
        System.out.println(sentence.toUpperCase());
        String upper = sentence.toUpperCase();
        System.out.println(upper);
        System.out.println(upper.toLowerCase());
        //number of character in a string
        System.out.println(sentence.length());
        sentence="    ";
        //remove blank space in a string
        sentence = sentence.trim();
        if(sentence.isEmpty())
        {
            System.out.println("Fill in your sentence");
        }
        else
        {
            System.out.println("Your sentence is good");
        }
        //remove blank space in a whole sentence
        String spaceless = upper.replace(" ","");
        //parameters or arguments
        System.out.println(spaceless);
    }
}

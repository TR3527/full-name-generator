package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Please enter your name below. ");

        System.out.print("First name: ");
        String firstName = read.nextLine().trim();

        System.out.print("Middle name: ");
        String middleName = read.nextLine().trim();

        System.out.print("Last name: ");
        String lastName = read.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = read.nextLine().trim();



        String fullName = "";


        if (middleName.isEmpty()){
            fullName =  ("Your full name is: " + firstName + " " + lastName);

        }
        else{
            fullName = ("Your full name is: " + firstName + " " + middleName + " " + lastName);
        }


        if(!suffix.isEmpty()) {

            fullName = fullName + ", " + suffix;


        }


        System.out.println(fullName);






//        if(middleName.isEmpty()){
//                middleName =
//
//            if(!suffix.isEmpty()){
//
//                ;
//
//            }
//
//        }else if(!middleName.isEmpty()){
//            System.out.println("Your full name is: " + firstName + " " + middleName + " " + lastName);
//        }
//
//        else if(!suffix.isEmpty()){
//
//            System.out.println("Your full name is: " + firstName + " " + middleName + " " + lastName + " " + suffix);
//
//        }




        //   System.out.println("Your full name is: " + firstName + " " + middleName + " " + lastName + " " + suffix);
    }
}

package com.knoldus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Creating the object of ApiString Class
        ApiString object_of_ApiString = new ApiString();

        Scanner input_object = new Scanner(System.in);
        System.out.println("Enter the String to get reversed string and its length");

        // Taking string input from the user
        String user_string = input_object.nextLine();


        // Calling the functions to find the reverse of the string and length of the string
        object_of_ApiString.reverseString(user_string);
        object_of_ApiString.getStringLength(user_string);

    }
}
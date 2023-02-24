package com.knoldus;



public class ApiString {

        // Function to Find the  reverse of the string
        public void reverseString(String user_string){

            if(user_string == null){

                System.out.println("String is null");

            }

            else{
                char[] char_array = user_string.toCharArray();
                int starting_index = 0;
                int last_index = char_array.length - 1;

                while(starting_index < last_index){

                    char temp = char_array[starting_index];
                    char_array[starting_index] = char_array[last_index];
                    char_array[last_index] = temp;

                    starting_index++;
                    last_index--;

                }
                String reversed_string = new String(char_array);
                System.out.println("Reversed string is :-"+ reversed_string);
            }
        }

        //  Function to Find the length of the string.
        public void getStringLength(String user_string){

            int length_of_String = 0;

            char[] char_array = user_string.toCharArray();

            for(char character : char_array){

                length_of_String++;
            }

            System.out.println("Length of String is :- "+ length_of_String);
        }
}
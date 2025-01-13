/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework2;

import java.util.Scanner;

/**
 *
 * @author hyna
 */
public class Homework2 {
    
 
    public static void main(String[] args) {
        //Create our string
        try (Scanner scanner = new Scanner(System.in)) {
            //Create our string
            String name;
            
            do { //do the following code while out user is typing anything that contains numbers or special characters
                System.out.println("Enter your name: ");
                name = scanner.nextLine(); //first and only user input
                 
                if (name.matches("[a-zA-Z]+")) { // Expression to ensure only letters
                break;
                } else {
                    // Error message if the input contains numbers or special characters
                    System.out.println("Error: Please enter a valid name using letters only. Please, try again."); 
                }
            } while (true); // Keep asking for input until it is valid
            
            // Modify the name: convert to uppercase and move the last letter to the front
            String modifiedName = name.toUpperCase(); // Convert the name to uppercase
            if (modifiedName.length() > 1) { 
                // If the name has more than one letter, rearrange the last letter to the front
                modifiedName = modifiedName.charAt(modifiedName.length() - 1) + modifiedName.substring(0, modifiedName.length() - 1);
            }
            
            // Display the modified name
            System.out.println("Your modified name is: " + modifiedName);                     
            } 
            }
   
            
}


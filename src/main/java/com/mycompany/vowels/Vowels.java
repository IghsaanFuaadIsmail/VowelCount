/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vowels;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Vowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence;
        System.out.println("Enter a sentence");
        sentence = sc.nextLine();
        
    }
     
    

public static int countVowels(String sentence){
    
    sentence = sentence.toLowerCase();
        
      String vowels = "aeiou";
        int count = 0;

        // Iterate through each character of the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            
            // Check if the character is a vowel by checking its index in the vowels string
            if (vowels.indexOf(currentChar) != -1) {
                count++;
            }
        }
        return count;
}
}
        
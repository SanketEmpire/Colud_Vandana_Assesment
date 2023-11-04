package com.empire.java;

public class PangramChecker {
	
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        String input = "elcome to the word of roman empire"; // Replace with your input string
        boolean isPangram = isPangram(input.toLowerCase()); // Convert to lowercase to handle case insensitivity
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
        boolean[] seen = new boolean[26]; // 26 letters in the  alphabet
        int count = 0;

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'a'; // Convert the character to an index (0-25)
                if (!seen[index]) {
                    seen[index] = true;
                    count++;
                }
            }
            if (count == 26) {
                return true; // All letters have been seen
            }
        }

        return false;
    }
}


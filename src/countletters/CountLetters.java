/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countletters;

import java.util.Scanner;

public class CountLetters {

    public static void main(String[] args) {
        final int LOW = 'A';		//smallest possible value
        final int HIGH = 'Z';		//highest possible value
        int[] letterCounts = new int[HIGH - LOW + 1];
        Scanner input = new Scanner(System.in);
        String phrase;
        char[] phraseLetters;
        int offset;		//array index

        /* prompt user for a phrase */
        System.out.print("Enter a phrase: ");
        phrase = input.nextLine();

        /* convert phrase to char array and count letter occurrences */
        phrase = phrase.toUpperCase();
        phraseLetters = phrase.toCharArray();
        for (int letter = 0; letter < phraseLetters.length; letter++) {
            if (phraseLetters[letter] >= 65 && phraseLetters[letter] <= 90) {
                offset = phraseLetters[letter] - LOW;
                letterCounts[offset] += 1;
            }
        }

        /* show letter occurrences */
        for (int i = LOW; i <= HIGH; i++) {
            System.out.println((char) i + ": " + letterCounts[i - LOW]);
        }
    }
}

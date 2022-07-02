package com.bridgelabz;
import java.util.Scanner;
public class AnagramDetection {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        System.out.println("Enter first string");
        String string1 = string.next();
        System.out.println("Enter second string");
        String string2 = string.next();

        AnagramDetection anagram = new AnagramDetection();
        anagram.anagram(string1, string2);

    }

    public void anagram(String string1, String string2) {
        char newString1[] = string1.toCharArray();
        char newString2[] = string2.toCharArray();

        sortMethod(newString1);
        sortMethod(newString2);

        string1 = new String(newString1);
        string2 = new String(newString2);

        if(string1.equals(string2))
            System.out.println(" They are anagrams");
        else
            System.out.println(" They are not anagrams");

    }
    public static void sortMethod(char[] array) {
        char temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > (array[j + 1])) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}


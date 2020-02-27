package anna.matsibota.kata;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class Kata {

    public static void main(String[] args) {
        //System.out.println(potatoes(82, 127, 80));
    }

    public static String createPhoneNumber(int[] numbers) {
        //String res = "";

        StringBuilder resust = new StringBuilder();

        resust.append("(" + numbers[0] + numbers[1] + numbers[2] + ") " + numbers[3] + numbers[4] + numbers[5] + "-" + numbers[6] + numbers[7] + numbers[8] + numbers[9]);
        return resust.toString();
    }

    public static boolean isVowel(String s) {
        String[] vowels = new String[] {"a", "e", "u","i", "o", "A", "I", "O", "U", "E", ""};

        for (String vowel: vowels) {
            if(s.contains(vowel) == true) return true;
        }

        return false;
        // your code goes here
    }

    // Convert integer to Whitespace format
    public static String whitespaceNumber(final int n) {
        StringBuilder result = new StringBuilder();
        int number = n;
        String numberBinary;

        if ( number < 0) {
            result.append("\t");
            number *= -1;
        } else {
            result.append(" ");
        }

        if (number != 0) {
            numberBinary = Integer.toBinaryString(number);
            for (int i = 0; i < numberBinary.length(); i++) {
                if(numberBinary.charAt(i) == '1') {
                    result.append("\t");
                } else {
                    result.append(" ");
                }
            }
        }

        result.append("\n");
        return result.toString();
    }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Kata {

    public static void main(String[] args) {

        System.out.println(isVowel(""));
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

   /* @Test
    public void tests() {
        assertEquals("(123) 456-7890", Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }*/
}

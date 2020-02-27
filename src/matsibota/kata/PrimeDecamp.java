package matsibota.kata;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeDecamp {

    private static ArrayList<Integer> arrayPrime = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 103));
    private static ArrayList<Integer> primeDivides = new ArrayList<>();
    private static ArrayList<Integer> degrees = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(factors(7919));
        System.out.println(primeDivides.toString());
        System.out.println(degrees.toString());

    }
    public static String factors(int n) {
        StringBuilder result = new StringBuilder();

        primeDivides.clear();
        degrees.clear();
         //find the prime factor decomposition of n
        findDecompositors(n);

        //make string
        for (int i = 0; i < primeDivides.size(); i++) {
            result.append("(" + primeDivides.get(i));
            if (degrees.get(i) > 1) {
                result.append("**" + degrees.get(i) + ")");
            } else {
                result.append(")");
            }
        }

        return result.toString();
    }

    private static void findDecompositors(int number) {
        boolean f = true; // maybe number is prime

        if (arrayPrime.contains(number)) {
            primeDivides.add(number);
            degrees.add(1);
            number = 0;
        }

        while (number > 1) {
            // error if primeDivides hasn't divide for number
            for (int prime : arrayPrime) {
                if (number % prime == 0) {

                    if (primeDivides.contains(prime)) {
                        degrees.set(degrees.size()-1, degrees.get(degrees.size()-1)+1);
                    } else {
                        primeDivides.add(prime);
                        degrees.add(1);
                    }

                    f = false;
                    number /= prime;
                    break;
                }
            }

            if (f) {
                primeDivides.add(number);
                degrees.add(1);
                number = 0;
            }
        }
    }

}
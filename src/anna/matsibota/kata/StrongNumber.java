package anna.matsibota.kata;

import java.util.ArrayList;

public class StrongNumber {
    public static void main(String[] args) {
        System.out.println(isStrongNumber(14));
    }

    public static String isStrongNumber(int num) {
        ArrayList arrayNum = numberToArray(num);
        int sumFactorialNumber = 0;

        for(int i = 0; i < arrayNum.size(); i++) {
            sumFactorialNumber += factorial((int) arrayNum.get(i));
        }

        if (sumFactorialNumber == num) return "STRONG!!!!";
        else return "Not Strong !!";
    }

     // number > 0
    private static ArrayList numberToArray (int number) {
        ArrayList arrayList = new ArrayList();

        while (number > 0) {
            arrayList.add(number % 10);
            number /= 10;
        }

        return arrayList;
    }

    // number >= 0
    private static int factorial (int number) {
        if(number == 0) return 1;
        return factorial(number-1) * number;
    }
}
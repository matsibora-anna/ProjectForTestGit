package matsibota.kata;

public class Thirteen {
    public static void main(String[] args) {
        System.out.println(thirt(1111111111));
    }
    // A Rule of Divisibility by 13
    public static long thirt(long n) {
        final int[] arrayBy13 = {1, 10, 9, 12, 3, 4};
        int[] arrayNumber;
        int j = 0;
        int numberCheng = 1;
        long sum = 0;

        StringBuilder number = new StringBuilder();
        number.append(n);

        if (numberCheng % 2 != 0) number = number.reverse();
        String[] arraySring = number.toString().split("");

        arrayNumber = new int[arraySring.length];
        for (int i = 0; i < arraySring.length; i++) {
            arrayNumber[i] = Character.getNumericValue(arraySring[i].charAt(0));

            sum += arrayBy13[j] * arrayNumber[i];

            if (j < arrayBy13.length - 1) {
                j++;
            } else {
                j = 0;
            }
        }

        numberCheng++;
        if (sum == n) return sum;

        return thirt(sum);

    }
}

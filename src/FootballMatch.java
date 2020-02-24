public class FootballMatch {

    public int matchResult(int result1, int result2, int result3, int result4) {

        int result = 0;// can be 0, 1 , 2
        if (result1 == result3 && result2 == result4) {
            result = 2;
        } else {
            if (result1 >= result2 && result3 >= result4 || result1 < result2 && result3 < result4) {
                result = 1;
            }
        }

        return result;
    }
}

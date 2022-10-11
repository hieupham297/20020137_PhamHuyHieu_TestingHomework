public class CorrectDays {
    public static void main(String[] args) {
        //int day, month, year;
        System.out.println(isCorrectDays(23, 1, 2012));
    }

    public static boolean isLeapYears(int nYear) {
        return nYear % 4 == 0 && nYear % 100 != 0 || nYear % 400 == 0;
    }

    public static int countDaysAMonth(int nMonth, int nYear) {
        int NumOfDays;

        switch (nMonth) {
            case 1, 3, 5, 7, 8, 10, 12:
                NumOfDays = 31;
                break;

            case 4, 6, 9, 11:
                NumOfDays = 30;
                break;

            case 2:
                if (isLeapYears(nYear)) {
                    NumOfDays = 29;
                }
                else NumOfDays = 28;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + nMonth);
        }

        return NumOfDays;
    }

    public static boolean isCorrectDays (int a, int b, int c) {
        if (c < 0) return false;
        if (b < 1 || b > 12) return false;
        return a >= 1 && a <= countDaysAMonth(b, c);
    }
}

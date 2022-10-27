public class CorrectDays {
    public static void main(String[] args) {
        //int day, month, year;
        System.out.println(isCorrectDays(30, 2, 2004));
    }

    public static boolean isCorrectDays (int a, int b, int c) {
        if (c < 0) return false;
        int NumOfDays;
        switch (b) {
            case 1, 3, 5, 7, 8, 10, 12:
                NumOfDays = 31;
                break;

            case 4, 6, 9, 11:
                NumOfDays = 30;
                break;

            case 2:
                if (c % 4 == 0 && c % 100 != 0 || c % 400 == 0) {
                    NumOfDays = 29;
                }
                else NumOfDays = 28;
                break;
            default:
                return false;
        }
        return a >= 1 && a <= NumOfDays;
    }
}

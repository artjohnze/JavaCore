package Section7.EXCERCISE.Solutioncode;

public class Excercise8 {
    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    public static boolean isTeen(int number) {
        return number > 12 && number < 20;
    }
}


//Add here main
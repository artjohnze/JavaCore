package Section7.EXCERCISE.Solutioncode;

public class Excercise12 {
    public static boolean isCatPlaying(boolean summer, int temperature) {

        int max = summer ? 45 : 35;
        return temperature >= 25 && temperature <= max;
    }
}


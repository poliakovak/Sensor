package app;

public class Indicator {

    public static String indicateColor(int temperature) {
        if (temperature <= 0) return "белый";
        else return "черный";
    }

    public static String indicateWeight(int temperature) {
        if (temperature <= 0) {
            return "1";
        } else {
            int weight = temperature * 2 + 1;
            return Integer.toString(weight);
        }
    }
}

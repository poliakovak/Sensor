package app;

public class Test {

    public static void main(String[] args) {

        Substance substance = new Substance();

        new ColorSensor(substance);
        new WeightSensor(substance);

        System.out.println("Температура вещества +25 ");
        substance.setState(25);

        System.out.println("Температура вещества -5 ");
        substance.setState(-5);
    }
}

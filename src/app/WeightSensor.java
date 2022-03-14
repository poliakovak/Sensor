package app;

public class WeightSensor extends Sensor {

    public WeightSensor(Substance substance) {
        this.substance = substance;
        this.substance.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Вес (г): "
                + Indicator.indicateWeight(substance.getState()));
    }
}

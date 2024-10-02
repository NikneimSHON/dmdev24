package javacore.lesson2.task2.object;

import javacore.lesson2.task2.interfaces.WithEnergy;

import java.util.Random;

public class Star extends SpaceAbstract implements WithEnergy {
    private Double brightnessLevel;
    private Double temperature;


    public Star(Double size, Double temperature, Double massObject, String NameObject) {
        super(massObject, TypeObject.STAR, NameObject, size);
        this.temperature = temperature;
        this.brightnessLevel = temperature / 2;
    }

    private void updateBrightness() {
        this.brightnessLevel = temperature / 2;
    }

    @Override
    public void energyProduct() {
        Random rand = new Random();
        int energy = rand.nextInt(1000, 15000);
        System.out.println("Произошёл термоядерный  синтез, тем самым выделилось " + energy + " энергии");
        temperature += energy;
        updateBrightness();
    }

    @Override
    public String toString() {
        return String.format("Star: %s%nTemperature: %.2f K%nBrightness Level: %s%n%s",
                getNameObject(), temperature, brightnessLevel, super.toString());
    }

    @Override
    public void description() {
        System.out.println("Звезды - это огромные, светящиеся шарообразные тела, состоящие в основном из водорода и гелия, " +
                "которые производят энергию в результате термоядерных реакций. " +
                "Звезды излучают свет и тепло, образуя основную среду, в которой могут формироваться планеты. " +
                "Они являются основными компонентами галактик и могут иметь различную массу, температуру и светимость.");
    }

    public Double getBrightnessLevel() {
        return brightnessLevel;
    }

    public void setBrightnessLevel(Double brightnessLevel) {
        this.brightnessLevel = brightnessLevel;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

}

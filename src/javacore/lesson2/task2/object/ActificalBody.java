package javacore.lesson2.task2.object;

import javacore.lesson2.task2.interfaces.WithEnergy;

public class ActificalBody extends SpaceObject implements WithEnergy {
    private Integer countEnergy;
    private final boolean transmitInfo;
    private final Integer launchYear;

    public ActificalBody(Double massObject, String NameObject, Double size, boolean transmitInfo, Integer launchYear) {
        super(massObject, TypeObject.ACTIFICAL_BODY, NameObject, size);
        this.countEnergy = 100;
        this.transmitInfo = transmitInfo;
        this.launchYear = launchYear;

    }

    public void energyProduct() {
        System.out.println("Станция выставила солнечные панели и начала производить энергию");
        countEnergy += 100;
    }

    @Override
    public void description() {
        System.out.println("Искусственные космические тела — это объекты, созданные человеком и " +
                "запущенные в космос для выполнения различных задач." +
                " Они могут быть спутниками, космическими станциями, зондами, межпланетными миссиями и другими аппаратами");
    }

    @Override
    public String toString() {
        return String.format("Artificial Body: %s%nEnergy Count: %d%nTransmit Info: %s%nLaunch Year: %d%n%s",
                getNameObject(), countEnergy, transmitInfo ? "Yes" : "No", launchYear, super.toString());
    }

    public Integer getCountEnergy() {
        return countEnergy;
    }

    public void setCountEnergy(Integer countEnergy) {
        this.countEnergy = countEnergy;
    }

    public boolean isTransmitInfo() {
        return transmitInfo;
    }

    public Integer getLaunchYear() {
        return launchYear;
    }
}

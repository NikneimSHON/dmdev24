package javacore.lesson2.task2.object;

import javacore.lesson2.task2.interfaces.WithEvolution;

import java.util.Random;

public class Planet extends SpaceObject implements WithEvolution {
    private String atmosphere;
    private boolean hasLife;

    public Planet(Double size, Double massObject, String NameObject, String atmosphere, boolean hasLife) {
        super(massObject, TypeObject.PLANET, NameObject, size);
        this.atmosphere = atmosphere;
        this.hasLife = hasLife;
    }

    @Override
    public void evolve() {
        Random rand = new Random();
        if (rand.nextBoolean()) {
            hasLife = true;
            System.out.println("Планета эволюционировала и появилась жизнь");
            System.out.println("Состав атмосферы поменялся");
            atmosphere = "Кислород";
        } else {
            hasLife = false;
            System.out.println("Взорвалась ядерная бомба и все погибли");
            System.out.println("Состав атмосферы поменялся");
            atmosphere = "Пыль и грязь";
        }
    }

    @Override
    public void description() {
        System.out.println("Планета — это крупное астрономическое тело, которое вращается вокруг звезды " +
                "(например, Солнца) и не является источником собственного света." +
                "Планеты обладают округлой формой, что обусловлено их гравитацией," +
                "и обычно имеют стабильную орбиту. В отличие от звезд, планеты отражают свет своего родительского светила.)");
    }

    @Override
    public String toString() {
        return String.format("Star: %s%nAtmosphere: %s%nHas Life: %s%n%s",
                getNameObject(), atmosphere, hasLife ? "Yes" : "No", super.toString());
    }

    public String getAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(String atmosphere) {
        this.atmosphere = atmosphere;
    }

    public boolean isHasLife() {
        return hasLife;
    }

    public void setHasLife(boolean hasLife) {
        this.hasLife = hasLife;
    }
}

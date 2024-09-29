package javacore.lesson2.task2.object;

public class Comet extends SpaceObject {
    private final Integer orbitalTimeYear;
    private boolean haveGlow;

    public Comet(Double size, Double massObject, String NameObject, Integer orbitalTimeYear, boolean haveGlow) {
        super(massObject, TypeObject.COMET, NameObject, size);
        this.orbitalTimeYear = orbitalTimeYear;
        this.haveGlow = haveGlow;

    }

    public void checkGlow() {
        if (orbitalTimeYear % 10 == 0) {
            haveGlow = true;
            System.out.println("Комета светится");
        } else {
            System.out.println("Комета не светится");
            haveGlow = false;
        }
    }

    @Override
    public void description() {
        System.out.println("Комета — это небольшое небесное тело, состоящее из льда, " +
                "пыли и камней, которое вращается вокруг Солнца по эллиптической орбите. " +
                "При приближении к Солнцу кометы нагреваются, " +
                "что вызывает испарение льда и выделение газов, образуя яркую газовую оболочку (кому) и " +
                "хвост, который всегда направлен от Солнца.");
    }

    @Override
    public String toString() {
        return String.format("Comet: %s%nOrbital Time: %d years%nHave Glow: %s%n%s",
                getNameObject(), orbitalTimeYear, haveGlow ? "Yes" : "No", super.toString());
    }

    public Integer getOrbitalTimeYear() {
        return orbitalTimeYear;
    }

    public boolean isHaveGlow() {
        return haveGlow;
    }

    public void setHaveGlow(boolean haveGlow) {
        this.haveGlow = haveGlow;
    }
}

package javacore.lesson2.task2.utils;

import javacore.lesson2.task2.object.SpaceAbstract;
import javacore.lesson2.task2.object.Star;

public final class SpaceUtils {
    private SpaceUtils() {

    }

    public static Boolean isStar(SpaceAbstract object) {
        return (object instanceof Star);
    }

    public static Double distanceCalculation(SpaceAbstract object1, SpaceAbstract object2) {
        return (object1.getMassObject() * object1.getTypeObject().getRank() + object2.getMassObject() * object2.getTypeObject().getRank()) * 1000;
    }
}

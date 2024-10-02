package javacore.lesson2.task2.utils;

import javacore.lesson2.task2.object.*;

public class SpaceRunner {
    public static void main(String[] args) {

        ActificialBody satellite = new ActificialBody(500.0, "Communication Satellite", 0.125, true, 2021);
        ActificialBody spaceProbe = new ActificialBody(300.0, "Mars Rover", 0.3, false, 2018);

        satellite.description();
        satellite.energyProduct();
        System.out.println("-------------------------");

        Asteroid asteroid1 = new Asteroid(950.0, 4.5e10, "Asteroid 2021 AB", 2021);
        Asteroid asteroid2 = new Asteroid(500.0, 2.0e10, "Asteroid 2020 XY", 2020);

        asteroid1.description();
        asteroid2.absorbed();
        System.out.println("-------------------------");

        Comet comet1 = new Comet(300.0, 1.2e9, "Comet Halley", 76, true);
        Comet comet2 = new Comet(150.0, 5.0e8, "Comet NEOWISE", 6800, false);

        comet1.description();
        comet1.checkGlow();
        System.out.println("-------------------------");

        Planet earth = new Planet(12742.0, 5.972e24, "Earth", "Nitrogen-Oxygen", true);
        Planet mars = new Planet(6779.0, 6.417e23, "Mars", "Carbon Dioxide", false);

        earth.description();
        earth.evolve();
        System.out.println("-------------------------");

        Star sun = new Star(1392000.0, 5778.0, 1.989e30, "Sun");
        Star betelgeuse = new Star(887000.0, 3500.0, 2.0e30, "Betelgeuse");

        sun.description();
        sun.energyProduct();
        System.out.println("-------------------------");


        System.out.println(satellite);
        System.out.println("-------------------------");
        System.out.println(spaceProbe);
        System.out.println("-------------------------");
        System.out.println(asteroid1);
        System.out.println("-------------------------");
        System.out.println(asteroid2);
        System.out.println("-------------------------");
        System.out.println(comet1);
        System.out.println("-------------------------");
        System.out.println(comet2);
        System.out.println("-------------------------");
        System.out.println(earth);
        System.out.println("-------------------------");
        System.out.println(mars);
        System.out.println("-------------------------");
        System.out.println(sun);
        System.out.println("-------------------------");
        System.out.println(betelgeuse);
        System.out.println("--------------------------");
        System.out.println(SpaceUtils.distanceCalculation(asteroid1,asteroid2));
        System.out.println(SpaceUtils.isStar(sun));

        sun.massEquals(asteroid1);
        System.out.println(sun.diameterCalculate());
    }
}

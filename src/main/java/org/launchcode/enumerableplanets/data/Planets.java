package org.launchcode.enumerableplanets.data;

public enum Planets {
    // list the planets here.
    // Mercury, Venus, Earth, Mars, Jupiter,
    // Saturn, Uranus, Neptune
    // Don't forget to capitalization convention and enum
    // syntax to separate value and end the list

    MERCURY ("mercury", 88),
    VENUS ("venus", 225),
    EARTH ("earth", 365),
    MARS ("mars", 687),
    JUPITER ("jupiter", 4333),
    SATURN ("saturn", 10759),
    URANUS ("uranus", 30687),
    NEPTUNE ("neptune", 60200);

    private final String name;
    private final int yearLength;

    Planets (String name, int yearLength) {
        this.name = name;
        this.yearLength = yearLength;
    }

    public String getName(){
        return name;
    }

    public int getYearLength(){
        return yearLength;
    }
}

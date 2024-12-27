package by.itacademy.psekhanikolai;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Gomel");
        cities.add("Brest");
        cities.add("Milan");
        cities.add("Wien");
        cities.add("Rom");
        System.out.println(cities);
        cities.set(2, "Basel");
        String cittyWithMax = Util.cittyWithMax(cities);
        System.out.println(cittyWithMax);
        String cittyWithMin = Util.cittyWithMin(cities);
        System.out.println(cittyWithMin);
    }
}
